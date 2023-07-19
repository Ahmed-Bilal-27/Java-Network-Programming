package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.*;
import java.io.*;
public class Weblog {
	public static void main(String[] args) {
		try (BufferedReader bin = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));) {
		for (String entry = bin.readLine();
		entry != null;
		entry = bin.readLine()) {
		// separate out the IP address
			int index = entry.indexOf(' ');
			String ip = entry.substring(0, index);
			String theRest = entry.substring(index);
			// Ask DNS for the hostname and print it out
			try {
				InetAddress address = InetAddress.getByName(ip);
				System.out.println(address.getHostName() + theRest);}
			catch (UnknownHostException ex) {
				System.out.println(entry);}}}
			catch (IOException ex) {
				System.out.println("Exception: " + ex);}}}