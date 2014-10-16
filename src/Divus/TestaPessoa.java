package Divus;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
	public static void main(String[] args) {
		//Com Contrutor
		Pessoa p = new Pessoa(11, "Thomaz", "111111");
//		p.setNome("thomaz");
//		p.setCpf("1111111");
//		p.setId(11);
		
		Pessoa p1 = new Pessoa(11, "Gostoso", "222222");
		
		//Sem Construtor
//		Pessoa p1 = new Pessoa();
//		p1.setNome("gostoso");
//		p1.setCpf("2222222");
//		p1.setId(11);
		
		System.out.println(p.equals(p1));
		
		Scanner t = new Scanner(System.in);
		List array = new ArrayList();
		for(int i=0; i<3;i++){
			System.out.println("Digite um id, Nome e CPF: ");
			Pessoa p4 = new Pessoa(t.nextInt(), t.nextLine(), t.nextLine());
			array.add(p4);
		}
		
		for(int i=0; i<array.size();i++){
//			System.out.println(array.get(i).toString());
			Pessoa p5 = (Pessoa) array.get(i);
			System.out.println(p5.getNome());
			System.out.println(p5.getId());
			System.out.println(p5.getCpf());
		}
	}

}

