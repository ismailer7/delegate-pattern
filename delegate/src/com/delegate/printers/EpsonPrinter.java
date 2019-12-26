package com.delegate.printers;

public class EpsonPrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

}
