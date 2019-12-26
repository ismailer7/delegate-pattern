package com.delegate;

import com.delegate.printers.EpsonPrinter;
import com.delegate.printers.HpPrinter;
import com.delegate.printers.Printer;

public class App {

	public static void main(String[] args) {

		PrinterController printerController = new PrinterController(new EpsonPrinter());
		printerController.print("print this my beloved slave!");
		// let delegate a service to another object.

		printerController.setPrinter(new HpPrinter());
		System.out.println("--------");
		printerController.print("print this my slave!");

		System.out.println("---------------");
		PrinterController p = new PrinterController(new Printer() {
			@Override
			public void print(String msg) {
				System.out.println("anonymous printer has work to do!");
				System.out.println(msg);
			}

		});
		p.print("print this plz anonymus printer!");
		System.out.println("----------------");
		PrinterController p2 = new PrinterController((msg) -> {
			System.out.println(msg);
		});
		p2.print("do this for me");

	}
}
