package com.mycompany.javanetworking;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.net.*;
public class URLConnectionExampleWithChannelAndBuffer {
	public static void main (String args[]) {
	try {
		URL url = new URL("https://cuiwah.edu.pk");
		URLConnection urlConnection = url.openConnection();
		InputStream inputStream = urlConnection.getInputStream();
		ReadableByteChannel channel = Channels.newChannel(inputStream);
		ByteBuffer buffer = ByteBuffer.allocate(64);
//		String line = null;
		while (channel.read(buffer) > 0) {
			System.out.println(new String(buffer.array()));
			buffer.clear();}
		channel.close();}
	catch (IOException ex) {
	// Handle exceptions
	}}}