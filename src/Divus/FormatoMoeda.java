package Divus;

import java.text.NumberFormat;

public class FormatoMoeda {
	public static void main(String[] args) {
		double d=1000;
		System.out.println(d);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		NumberFormat nf2 = NumberFormat.getNumberInstance();
		nf2.setMinimumFractionDigits(2);
		NumberFormat nf3 = NumberFormat.getNumberInstance();
		System.out.println(nf.format(d));
		System.out.println(nf2.format(d));
		System.out.println(nf3.format(d));
	}

}
