package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
public class MyAddress_01 {
	public static void main(String[] args) {
		try {
			InetAddress me = InetAddress.getLocalHost();
			String dottedQuad = me.getHostAddress();
			byte[] address = me.getAddress();
			int[] outputArray = new int[address.length];
			for (int i = 0; i < address.length; ++i) {
				for (byte temp : address) {
					int a = temp < 0 ? temp + 256 : temp;
					outputArray [i] = a;}}
	        System.out.println(outputArray);
			System.out.println(address);
			System.out.println(me);
			System.out.println("My address is " + dottedQuad);}
		catch (UnknownHostException ex) {
			System.out.println("I'm sorry. I don't know my own address.");}}}