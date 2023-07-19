package com.mycompany.javanetworking;
import java.io.*;
import java.security.*;
public class DigestThread extends Thread {
	private String filename;
	public DigestThread(String filename) {
	this.filename = filename;}
	@Override
	public void run() {
		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-256");
			DigestInputStream din = new DigestInputStream(new FileInputStream(new File(filename)), sha);
			while (din.read() != -1) ;
			din.close();
			byte[] digest = sha.digest();
			StringBuilder result = new StringBuilder(filename);
			result.append(": ");
			result.append(digest);
			System.out.println(result);
			} catch (IOException ex) {
			System.err.println(ex);
			} catch (NoSuchAlgorithmException ex) {
			System.err.println(ex);}}
			public static void main(String[] args) {
			for (String filename : args) {
			Thread t = new DigestThread(filename);
			t.start();}}}