package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
public class RelativeURI {
	public static void main (String args[]) throws URISyntaxException {
		URI absolute = new URI("http://www.example.com/");
		URI relative = new URI("images/logo.png");
		URI resolved = absolute.resolve(relative);
		System.out.println(resolved);
		URI top = new URI("javafaq/books/");
		URI resolved1 = top.resolve("jnp3/examples/07/index.html");
		System.out.println(resolved1);
		URI absolute1 = new URI("http://www.example.com/images/logo.png");
		URI top1 = new URI("http://www.example.com/");
		URI relative1 = top1.relativize(absolute1);
		System.out.println(relative1);}}