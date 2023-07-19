package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
import java.io.*;
public class NetworkStreamsWithNestedTryWithResources {
	public static void main (String args[]) {
		try {
			URL u = new URL("https://www.oreilly.com");
			try (InputStream in = u.openStream()) {
				int c;
				while ((c = in.read()) != -1) {
					System.out.write(c);}}}
		catch (IOException ex) {
				System.err.println(ex);}}}