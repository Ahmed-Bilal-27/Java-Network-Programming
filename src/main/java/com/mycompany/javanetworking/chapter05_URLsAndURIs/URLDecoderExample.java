package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
import java.io.*;
public class URLDecoderExample {
	public static void main (String args[]) throws UnsupportedEncodingException {
		String input = "https://www.google.com/search?hl=en&as_q=Java&as_epq=I%2FO";
		String output = URLDecoder.decode(input, "UTF-8");
		System.out.println(output);}}