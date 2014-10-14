package Divus;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatarCalendario {
	public static void main(String[] args) {
		double salario = 1300;
		String nome = "Tony";
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nome + " recebeu um pagamento de " + nf.format(salario) + " na data de: " + df.format(cal.getTime()));
		//System.out.printf("%s recebeu um pagamento %.2f na data de %td/%<tm/%<tY", nome,salario, cal.getTime());
		System.out.printf("%s recebeu um pagamento %,"
				+ ".2f na data de %td/%3$tm/%3$tY", nome,salario, cal.getTime());
	}
	

}
