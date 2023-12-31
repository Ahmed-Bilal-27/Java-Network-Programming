package com.mycompany.javanetworking;
import java.util.*;
public class InstanceCallbackDigestUserInterface {
	private String filename;
	private byte[] digest;
	public InstanceCallbackDigestUserInterface(String filename) {
	this.filename = filename;}
	public void calculateDigest() {
	InstanceCallbackDigest cb = new InstanceCallbackDigest(filename, this);
	Thread t = new Thread(cb);
	t.start();}
	void receiveDigest(byte[] digest) {
	this.digest = digest;
	System.out.println(this);}
	@Override
	public String toString() {
	String result = filename + ": ";
	if (digest != null) {
	result += digest;}
	else {
	result += "digest not available";}
	return result;}
	public static void main(String[] args) {
	for (int i =  0 ; i < 1 ; ++i) {
		Scanner sc = new Scanner(System.in);
		String filename;
	// Calculate the digest
	InstanceCallbackDigestUserInterface d
	= new InstanceCallbackDigestUserInterface(filename = sc.next());
	d.calculateDigest();}}}