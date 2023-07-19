package com.mycompany.javanetworking.chapter04_InternetAddresses;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class IPCharacteristics_01 extends Thread {
	private String addr;
	IPCharacteristics_01 (String addr){
		this.addr = addr;}
	@Override
	public void run() {
		synchronized (System.out) {
			try {
			InetAddress address = InetAddress.getByName(addr);
			if (address.isAnyLocalAddress()) {
			System.out.println(address + " is a wildcard address.");}
			if (address.isLoopbackAddress()) {
			System.out.println(address + " is loopback address.");}
			if (address.isLinkLocalAddress()) {
				System.out.println(address + " is a link-local address.");}
			else if (address.isSiteLocalAddress()) {
				System.out.println(address + " is a site-local address.");}
				else {
				System.out.println(address + " is a global address.");}
				if (address.isMulticastAddress()) {
					if (address.isMCGlobal()) {
					System.out.println(address + " is a global multicast address.");}
					else if (address.isMCOrgLocal()) {
					System.out.println(address + " is an organization wide multicast address.");}
					else if (address.isMCSiteLocal()) {
					System.out.println(address + " is a site wide multicast address.");}
					else if (address.isMCLinkLocal()) {
					System.out.println(address + " is a subnet wide multicast address.");}
					else if (address.isMCNodeLocal()) {
					System.out.println(address + " is an interface-local multicast address.");}
					else {
					System.out.println(address + " is an unknown multicastaddress type.");}}
				else {
				System.out.println(address + " is a unicast address.");}}
			catch (UnknownHostException ex) {
				System.err.println("Could not resolve " + addr);}}}
	public static void main(String[] args) {
		for (String addr : args) {
			Thread t = new IPCharacteristics_01(addr);
			t.start();}}}