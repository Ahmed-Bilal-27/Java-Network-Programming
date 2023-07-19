package com.mycompany.javanetworking;
import java.io.*;
public class LogFileRunner extends Thread {
	private String filename = "D:\\Programs\\Java\\JavaNetworking\\src\\main\\java\\com\\mycompany\\javanetworking\\TXTFiles\\LogFile.txt";
	private String message;
	private int count;
	public LogFileRunner (String msg, int i) {
		this.message = msg;
		this.count = i;}
	@Override
	public void run() {
		try {
			LogFile lf = new LogFile(filename);
			lf.writeEntry(message);
			if (count == 3) {
				lf.close();}}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}}
	public static void main(String[] args) {
		for (int i = 0; i < 4; ++i) {
			LogFileRunner lfr = new LogFileRunner("Thread:" + i, i);
			lfr.start();}}}