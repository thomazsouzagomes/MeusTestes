package Divus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestaEscola {
	public static void main(String[] args) {
		Aluno a1 = new Aluno (01, "Thomaz", null);
		Aluno a2 = new Aluno (02, "Souza", null);
		
		Turma t1 = new Turma (11, null, "TP");
		
		List alunos = new ArrayList();		
		alunos.add(a1);
		alunos.add(a2);
		
		a1.setTurma(t1);
		a2.setTurma(t1);
		
		t1.setAlunos(alunos);
		
		Calendar cal = Calendar.getInstance();
		
		Nota n1 = new Nota (1, cal, 8, a1);
		Nota n2 = new Nota (2, cal, 9, a1);
		
		Nota n3 = new Nota (1, cal, 7, a2);
		Nota n4 = new Nota (2, cal, 8, a2);
		
		List notas = new ArrayList();
		notas.add(n1);
		notas.add(n1);
		notas.add(n3);
		notas.add(n4);
		
		for (Object o : alunos){
			Aluno a = (Aluno) o;
			System.out.println("Nome: " + a.getNome() + " - Turma: " + a.getTurma().getNome());
			for(Object n : notas){
				Nota nn = (Nota) n;
				if(nn.getAluno().equals(a)){
					System.out.println("Nota: " + nn.getValor() + " - Data: " + new SimpleDateFormat("dd/MM/YYYY").format(nn.getData().getTime()));
				}
			}
		}
		
		
	}

}
