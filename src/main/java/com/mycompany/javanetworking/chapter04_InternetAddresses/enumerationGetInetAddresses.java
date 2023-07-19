package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
import java.util.*;
public class enumerationGetInetAddresses {
	public static void main (String args[]) throws SocketException {
		NetworkInterface ni = NetworkInterface.getByName("eth10");
		Enumeration<InetAddress> addresses = ni.getInetAddresses();
		while (addresses.hasMoreElements()) {
			System.out.println(addresses.nextElement());}}}