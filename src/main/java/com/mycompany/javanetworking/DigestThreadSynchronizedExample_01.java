package com.mycompany.javanetworking;
import java.io.*;
import java.security.*;
public class DigestThreadSynchronizedExample_01 extends Thread {
	private String filename;
	public DigestThreadSynchronizedExample_01(String filename) {
	this.filename = filename;}
	@Override
	public void run() {
		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-256");
			DigestInputStream din = new DigestInputStream(new FileInputStream(new File(filename)), sha);
			while (din.read() != -1) ;
			din.close();
			byte[] digest = sha.digest();
			System.out.print(filename + ": ");
			System.out.println(digest);
			System.out.println();
			} catch (IOException ex) {
			System.err.println(ex);
			} catch (NoSuchAlgorithmException ex) {
			System.err.println(ex);}}
			public static void main(String[] args) {
			for (String filename : args) {
			Thread t = new DigestThreadSynchronizedExample_01(filename);
			t.start();}}}