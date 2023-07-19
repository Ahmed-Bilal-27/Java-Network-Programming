package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
import java.io.*;
public class URLConnectionOpenConnection {
	public static void main (String args[]) {
		try {
			URL u = new URL("https://www.cuiwah.edu.pk/");
			try {
			URLConnection uc = u.openConnection();
			InputStream in = uc.getInputStream();
			// read from the connection...
			int c;
			while ((c = in.read()) != -1) {
				System.out.write(c);}}
			catch (IOException ex) {
			System.err.println(ex);}}
		catch (MalformedURLException ex) {
			System.err.println(ex);}}}