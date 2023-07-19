package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
public class SameFile {
	public static void main (String[] args) {
		try {
			URL u1 = new URL("https://www.ncsa.uiuc.edu/HTMLPrimer.html#GS");
			URL u2 = new URL("https://www.ncsa.uiuc.edu/HTMLPrimer.html#HD");
			if (u1.sameFile(u2)) {
			System.out.println(u1 + " is the same file as \n" + u2);}
			else {
			System.out.println(u1 + " is not the same file as \n" + u2);}}
		catch (MalformedURLException ex) {
			System.err.println(ex);}}}