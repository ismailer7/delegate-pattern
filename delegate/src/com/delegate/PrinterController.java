package com.delegate;

import com.delegate.printers.Printer;

public class PrinterController implements Printer {
	
	private Printer printer;
	
	public PrinterController(Printer printer) {
		this.printer = printer;
	}
	
	@Override
	public void print(String msg) {
		printer.print(msg);
	}
	
	public Printer getPrinter() {
		return this.printer;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
}
