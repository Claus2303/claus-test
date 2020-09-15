package de.claus.certificate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class GoogleSSLSocket {

	public static void main(String[] args) {
		try {
			new GoogleSSLSocket().processSocketGoogle();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void processSocketGoogle() throws IOException {
		String host = "www.google.com";
		int port = 443;
		SocketFactory basicSocketFactory = SocketFactory.getDefault();
		Socket s = basicSocketFactory.createSocket(host,port);
		// s is a TCP socket
		SSLSocketFactory tlsSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
		s = tlsSocketFactory.createSocket(s, host, port, true);
		BufferedReader in =
		        new BufferedReader(
		            new InputStreamReader(s.getInputStream()));
		String userInput;
		while ((userInput = in.readLine()) != null) {
		    System.out.println("echo: " + userInput);
		}
		// s is now a TLS socket over TCP
	}
}
