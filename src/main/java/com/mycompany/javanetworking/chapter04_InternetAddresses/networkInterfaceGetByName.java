package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
public class networkInterfaceGetByName {
	public static void main (String args[]) {
		try {
			NetworkInterface ni = NetworkInterface.getByName("eth0");
			if (ni == null) {
				System.out.println("No such interface: eth0");}
			else{
				System.out.println("Found interface: eth0 " + ni);}}
		catch (SocketException ex) {
			System.out.println("Could not list sockets.");}}}