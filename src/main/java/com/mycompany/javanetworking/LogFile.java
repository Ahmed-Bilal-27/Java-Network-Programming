package com.mycompany.javanetworking;
import java.io.*;
import java.util.*;
public class LogFile {
	private Writer out;
	public LogFile(String f) throws IOException {
	BufferedWriter fw = new BufferedWriter (new FileWriter(new File(f)));
	this.out = fw;}
	public void writeEntry(String message) throws IOException {
		synchronized (out) {
		Date d = new Date();
		out.write(d.toString());
		out.write('\t');
		out.write(message);
		out.write("\r\n");}}
	public void close() throws IOException {
		out.flush();
		out.close();}}