package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
public class AddressTests {
	public static void getVersion(InetAddress ia) {
		byte[] address = ia.getAddress();
		if (address.length == 4) {
			System.out.println("It is a IPv4 address.");
		}
		else if (address.length == 16) {
			System.out.println("It is a IPv6 address.");}
		else{
			System.out.println("It does not match any address catogary.");}}
	public static void main(String[] args) {
		try {
		InetAddress me = InetAddress.getLocalHost();
		AddressTests.getVersion(me);
		String dottedQuad = me.getHostAddress();
		System.out.println("My address is " + dottedQuad);}
		catch (UnknownHostException ex) {
		System.out.println("I'm sorry. I don't know my own address.");}}}