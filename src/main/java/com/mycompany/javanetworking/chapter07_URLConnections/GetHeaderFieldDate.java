package com.mycompany.javanetworking.chapter07_URLConnections;

import java.util.*;
import java.io.*;
import java.net.*;

public class GetHeaderFieldDate {
	public static void main (String args[]) {
		try {
			URL u = new URL("https://www.daraz.pk/");
			URLConnection uc = u.openConnection();
			Date expires = new Date(uc.getHeaderFieldDate("expires", 0));
			long lastModified = uc.getHeaderFieldDate("last-modified", 0);
			Date now = new Date(uc.getHeaderFieldDate("date", 0));
			System.out.println(expires + "\n" + lastModified + "\n" + now + "\n");}
		catch (MalformedURLException ex) {
			System.err.println("https://cuiwah.edu.pk is not a URL I understand");}
		catch (IOException ex) {
			System.err.println(ex);}}
}