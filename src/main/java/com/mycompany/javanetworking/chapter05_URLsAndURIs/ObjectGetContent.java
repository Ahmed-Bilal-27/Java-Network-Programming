package com.mycompany.javanetworking.chapter05_URLsAndURIs;
import java.net.*;
import java.io.*;
public class ObjectGetContent {
	public static void main (String args[]) throws IOException {
		URL u = new URL("https://www.nwu.org/");
		Class<?>[] types = new Class[3];
		types[0] = String.class;
		types[1] = Reader.class;
		types[2] = InputStream.class;
		Object o = u.getContent(types);
		if (o instanceof String) {
			System.out.println("o is a instance of String.");
			System.out.println(o);}
		else if (o instanceof Reader) {
			System.out.println("o is a instance of Reader.");
			int c;
			Reader r = (Reader) o;
			while ((c = r.read()) != -1) {
				System.out.print((char) c);}
			r.close();}
		else if (o instanceof InputStream) {
			System.out.println("o is a instance of Input Stream.");
			int c;
			InputStream in = (InputStream) o;
			while ((c = in.read()) != -1) {
				System.out.write(c);}
			in.close();}
		else {
			System.out.println("Error: unexpected type " + o.getClass());}}}