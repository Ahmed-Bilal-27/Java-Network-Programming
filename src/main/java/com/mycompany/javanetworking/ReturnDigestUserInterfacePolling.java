package com.mycompany.javanetworking;

public class ReturnDigestUserInterfacePolling {
	public static void main(String[] args) {
		ReturnDigest[] digests = new ReturnDigest[args.length];
		for (int i = 0; i < args.length; i++) {
		// Calculate the digest
		digests[i] = new ReturnDigest(args[i]);
		digests[i].start();}
		for (int i = 0; i < args.length; i++) {
		while (true) {
		// Now print the result
		byte[] digest = digests[i].getDigest();
		if (digest != null) {
		StringBuilder result = new StringBuilder(args[i]);
		result.append(": ");
		result.append(digest);
		System.out.println(result);
		break;}}}}}