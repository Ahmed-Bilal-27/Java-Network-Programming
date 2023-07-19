package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
public class networkInterfaceGetByInetAddress {
	public static void main (String args[]) {
		try {
			InetAddress local = InetAddress.getByName("fe80::1a08:d018:365d:c5f9%24");
			NetworkInterface ni = NetworkInterface.getByInetAddress(local);
			if (ni == null) {
				System.out.println("That's weird. No local loopback address.");}
			else{
				System.out.println("Found interface for loopback address " + ni);}}
		catch (SocketException ex) {
			System.out.println("Could not list network interfaces." );}
		catch (UnknownHostException ex) {
			System.out.println("That's weird. Could not lookup 127.0.0.1.");}}}