package com.delegate.printers;

public class HpPrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

}
