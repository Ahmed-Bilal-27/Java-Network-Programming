package com.mycompany.javanetworking;
import java.io.*;
import java.net.*;
public class URLConnectionExample {
	public static void main (String args[]) {
		try {
			URL url = new URL("https://cuiwah.edu.pk");
			URLConnection urlConnection = url.openConnection();
			BufferedReader br = new BufferedReader(
			new InputStreamReader(
			urlConnection.getInputStream()));
			String line;
			while ((line = br.readLine()) != null) {
			System.out.println(line);
			}
			br.close();
			} catch (IOException ex) {// Handle exceptions
}}}