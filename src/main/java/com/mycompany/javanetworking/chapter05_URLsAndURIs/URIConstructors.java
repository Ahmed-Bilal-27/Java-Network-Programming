package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
public class URIConstructors {
	public static void main (String args[]) throws URISyntaxException {
		URI voice = new URI("tel:+1-800-9988-9938");
		System.out.println(voice);
		URI web = new URI("http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc");
		System.out.println(web);
		URI book = new URI("urn:isbn:1-565-92870-9");
		System.out.println(book);
		URI absolute = new URI("http", "//www.ibiblio.org" , null);
		System.out.println(absolute);
		URI relative = new URI(null, "/javafaq/index.shtml", "today");
		System.out.println(relative);
		URI today= new URI("http", "www.ibiblio.org", "/javafaq/index.html", "today");
		System.out.println(today);
		URI today1 = new URI("http", "www.ibiblio.org", "/javafaq/index.html","referrer=cnet&date=2014-02-23", "today");
		System.out.println(today1);
		URI styles = new URI("ftp", "anonymous:elharo@ibiblio.org","ftp.oreilly.com", 21, "/pub/stylesheet", null, null);
		System.out.println(styles);
		URI styles1 = URI.create("ftp://anonymous:elharo%40ibiblio.org@ftp.oreilly.com:21/pub/stylesheet");
		System.out.println(styles1);}}