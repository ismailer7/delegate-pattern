package com.delegate.printers;

public class CanonPrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

}
