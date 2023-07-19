package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
import java.io.*;
public class OpenStream {
	public static void main (String args[]) {
		try {
			URL u = new URL("https://www.lolcats.com");
			InputStream in = u.openStream();
			int c;
			while ((c = in.read()) != -1) { 
				System.out.write(c);}
			in.close();}
		catch (IOException ex) {
			System.err.println(ex);}}}