package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
public class OReillyByAddresses {
	public static void main (String[] args) {
		try {
			InetAddress[] addresses01 = InetAddress.getAllByName("www.cuiwah.edu.pk");
			for (InetAddress address : addresses01) {
			System.out.println(address);}
			InetAddress address02 = InetAddress.getByName("104.106.96.125");
			System.out.println(address02.getHostName());}
		catch (UnknownHostException ex) {
			System.out.println("Could not find www.oreilly.com");}}}