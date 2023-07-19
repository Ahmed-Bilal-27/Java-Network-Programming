package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
import java.io.*;
public class NetworkStreamsWithDisposePattern {
	public static void main (String args[]) {
		InputStream in = null;
		try {
				URL u = new URL("https://www.orielly.com");
				in = u.openStream();
				int c;
				while ((c = in.read()) != -1) {
					System.out.write(c);}
				}
		catch (IOException ex) {
				System.err.println(ex);}
		finally {
				try {
				if (in != null) {
				in.close();}}
				catch (IOException ex) {
				// ignore
				}}}}