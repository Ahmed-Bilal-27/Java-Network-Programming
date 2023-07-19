package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
public class GetByAddressExample {
	public static void main (String args[]) {
	try {
		byte[] address = {107, 23, (byte) 216, (byte) 196};
		InetAddress lessWrong = InetAddress.getByAddress(address);
		InetAddress lessWrongWithname = InetAddress.getByAddress("lesswrong.com", address);
		System.out.println(lessWrong + "\n" + lessWrongWithname);}
	catch (UnknownHostException exc) {
		exc.printStackTrace();}}}