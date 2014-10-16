package Pesquisados;

//exemplo – Para fazer a tarefa 2 (retirado do material complementar disponibilizado)

import java.util.Scanner;

public class ExemploScanner
{
	public static void main (String[] args) {
		String resp="N";
		Scanner s = new Scanner(System.in); //
		do{
			System.out.println("Digite o nome: ");
			String nome = s.nextLine();
			System.out.println("Ola " +nome);
			System.out.println("Digite o sexo: (F ou M)");
			String sexo = s.next().substring(0,1); //retorna o primeiro caracter da string sexo
			if(sexo.equals("f") || sexo.equals("F")) // sexo.equals("f") verifica se o conteudo da variável sexo é igual a f ou F nesse caso não podemos utilizar == !!
			{
				System.out.println("Digite a idade: ");
				int idade = s.nextInt();
				System.out.println("Voce tem namorado? (S/N)");
				String namoro = s.next().substring(0,1); //retorna o primeiro caracter da string namoro
				if(namoro.equals("s") || namoro.equals("S"))
					System.out.println("Foi bom te conhecer!");
				else
					System.out.println("Prazer, eu tambem estou solteiro!");
			}
			else
			{
				System.out.println("Nao foi aceito!");
			}
			System.out.println("Deseja continuar? (S/N)");
			resp= s.next().substring(0,1); //retorna o primeiro caracter da string resp
			s.nextLine();
		} while (resp.equalsIgnoreCase("s")); //verificar a entrada de letra minuscula ou maiuscula na variavel resp - equalsIgnoreCase

		System.out.println("-------------FIM-------------");
	}
}
//.toupcase					coloca tudo mausculo
//.charat 					primeira letra
//.tolowcase ou todowncase	colocar as letras minuscula
//.equalsIgnoreCase			Ignorar case