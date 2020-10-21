package de.claus.certificate;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

public class SSLServerSocketExample {
	
	final static String pathToStores = "/src/main/keystore";
	final static String keyStoreFile = "server1.keystore";
	final static String passwd = "schorsch";
	
	final static int serverport = 12345;
	final static boolean debug = false;
	
	private void doServerSide() throws Exception{
	    SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
	    SSLServerSocket ss = (SSLServerSocket)ssf.createServerSocket(serverport);

	    SSLSocket sslsocket = (SSLSocket)ss.accept();
	    InputStream in = sslsocket.getInputStream();
	    
	    OutputStream out = sslsocket.getOutputStream();
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(in));
	    String output = null;
	    while ((output = br.readLine())!= null) {
			System.out.println(output);
			System.out.flush();
		}
	    sslsocket.close();
	}
	public static void main(String[] args) throws Exception {
		String trustName = System.getProperty("user.dir")+"/"+pathToStores+"/"+keyStoreFile;
		System.setProperty("javax.net.ssl.keyStore", trustName);
		System.setProperty("javax.net.ssl.keyStorePassword", passwd);
		
		if (debug) {
			System.setProperty("javax.net.debug", "all");
		}
		new SSLServerSocketExample().doServerSide();
	}
}
