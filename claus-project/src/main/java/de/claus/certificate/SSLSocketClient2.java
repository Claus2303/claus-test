package de.claus.certificate;

import java.io.IOException;
import java.io.OutputStream;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class SSLSocketClient2 {
	
	final static String pathToStores = "/src/main/keystore";
	final static String keyStoreFile = "truststore";
	final static String passwd = "schorsch";
	
	final static String servername = "localhost";
	final static int serverport = 12345;
	
	static boolean debug = false;
	
	void doClientSide() throws UnknownHostException, IOException {
		SSLSocketFactory ssf = (SSLSocketFactory)SSLSocketFactory.getDefault();
		SSLSocket socket = (SSLSocket) ssf.createSocket(servername, serverport);
		
		OutputStream out = socket.getOutputStream();
		out.write("Hello".getBytes());
		out.flush();
		socket.close();
	}
	
	public static void main(String[] args) {
		String trustName = System.getProperty("user.dir")+"/"+pathToStores+"/"+keyStoreFile;
		System.setProperty("javax.net.ssl.trustStore", trustName);
		System.setProperty("javax.net.ssl.trustStorePassword", passwd);
		
		if (debug) {
			System.setProperty("javax.net.debug", "all");
		}
		try {
			new SSLSocketClient2().doClientSide();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
