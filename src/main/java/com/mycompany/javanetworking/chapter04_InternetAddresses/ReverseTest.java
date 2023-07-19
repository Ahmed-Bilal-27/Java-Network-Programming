package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
public class ReverseTest {
	public static void main (String[] args) throws UnknownHostException {
		InetAddress ia = InetAddress.getByName("104.106.96.125");
		System.out.println(ia.getCanonicalHostName());}}