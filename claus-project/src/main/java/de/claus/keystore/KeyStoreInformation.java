package de.claus.keystore;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class KeyStoreInformation {
	public static void main(String[] args) {
		
	}
	
	private void processKeyStore() throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		KeyStore ks = KeyStore.getInstance("pcks12");
		//ks.load(new FileInputStream("newKeyStoreFileName.jks"), pwdArray);
	}
}
