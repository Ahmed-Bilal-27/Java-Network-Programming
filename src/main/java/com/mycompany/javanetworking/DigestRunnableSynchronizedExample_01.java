package com.mycompany.javanetworking;
import java.io.*;
import java.security.*;
public class DigestRunnableSynchronizedExample_01 implements Runnable {
	private String filename;
	public DigestRunnableSynchronizedExample_01(String filename) {
		this.filename = filename;}
	@Override
	public void run() {
	try {
	MessageDigest sha = MessageDigest.getInstance("SHA-256");
	DigestInputStream din = new DigestInputStream(new FileInputStream(filename), sha);
	while (din.read() != -1) ;
	din.close();
	byte[] digest = sha.digest();
	synchronized (System.out){
	System.out.print(filename + ": ");
	System.out.println(digest);
	System.out.println();}
	} catch (IOException ex) {
	System.err.println(ex);
	} catch (NoSuchAlgorithmException ex) {
	System.err.println(ex);}}
	public static void main(String[] args) {
	for (String filename : args) {
		DigestRunnableSynchronizedExample_01 dr = new DigestRunnableSynchronizedExample_01(filename);
		Thread t = new Thread(dr);
		t.start();}}}