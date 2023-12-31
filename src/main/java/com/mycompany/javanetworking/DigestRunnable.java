package com.mycompany.javanetworking;
import java.io.*;
import java.security.*;
public class DigestRunnable implements Runnable {
	private String filename;
	public DigestRunnable(String filename) {
		this.filename = filename;}
	@Override
	public void run() {
	try {
	FileInputStream in = new FileInputStream(filename);
	MessageDigest sha = MessageDigest.getInstance("SHA-256");
	DigestInputStream din = new DigestInputStream(in, sha);
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
	DigestRunnable dr = new DigestRunnable(filename);
	Thread t = new Thread(dr);
	t.start();}}}