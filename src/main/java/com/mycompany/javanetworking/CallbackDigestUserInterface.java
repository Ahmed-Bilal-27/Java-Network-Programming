package com.mycompany.javanetworking;

public class CallbackDigestUserInterface {
	public static void receiveDigest(byte[] digest, String name) {
		StringBuilder result = new StringBuilder(name);
		result.append(": ");
		result.append(digest);
		System.out.println(result);}
		public static void main(String[] args) {
		for (String filename : args) {
		// Calculate the digest
		CallbackDigest cb = new CallbackDigest(filename);
		Thread t = new Thread(cb);
		t.start();}}}