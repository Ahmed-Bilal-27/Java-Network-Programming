package com.mycompany.javanetworking;
import java.io.*;
import java.security.*;
public class ReturnDigest extends Thread {
	private String filename;
	private byte[] digest;
	public ReturnDigest(String filename) {
	this.filename = filename;}
	@Override
	public void run() {
	try {
	MessageDigest sha = MessageDigest.getInstance("SHA-256");
	DigestInputStream din = new DigestInputStream(new FileInputStream(new File(filename)), sha);
	while (din.read() != -1) ; // read entire file
	din.close();
	digest = sha.digest();
	} catch (IOException ex) {
	System.err.println(ex);
	} catch (NoSuchAlgorithmException ex) {
	System.err.println(ex);}}
	public byte[] getDigest() {
	return digest;}}