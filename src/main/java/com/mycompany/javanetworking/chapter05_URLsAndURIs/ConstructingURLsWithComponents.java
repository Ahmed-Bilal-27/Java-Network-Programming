package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
public class ConstructingURLsWithComponents {
	public static void main (String args[]) {
		try {
			URL u = new URL("http", "www.eff.org", "/blueribbon.html#intro");
			System.out.println(u);
			URL u1 = new URL("http", "fourier.dur.ac.uk", 8000, "/~dma3mjh/jsci/");
			System.out.println(u1);
			URL u2 = new URL("http://www.ibiblio.org/javafaq/index.html");
			URL u3 = new URL (u2, "mailinglists.html");
			System.out.println(u2 + "\n" + u3);}
		catch (MalformedURLException ex) {
			System.out.println(ex);
			throw new RuntimeException("shouldn't happen; all VMs recognize http");}}}