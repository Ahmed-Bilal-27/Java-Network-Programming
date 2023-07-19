package com.mycompany.javanetworking.chapter07_URLConnections;

import java.io.*;
import java.net.*;

public class GetHeaderFieldKey {
	public static void main (String args[]) {
		try {
			URL u = new URL("https://cuiwah.edu.pk");
			URLConnection uc = u.openConnection();
			String header6 = uc.getHeaderFieldKey(4);
			System.out.println(header6);}
		catch (MalformedURLException ex) {
			System.err.println("https://cuiwah.edu.pk is not a URL I understand");}
		catch (IOException ex) {
			System.err.println(ex);}
			System.out.println();}}