package Divus;

public class Aluno implements Comparable<Aluno>{
	private Long id;
	private String nome;	
	private Turma turma;

	public Aluno(long id, String nome, Turma turma) {
		this.id = id;
		this.nome = nome;
		this.turma = turma;
	}
	
	public int compareTo(Aluno a){
//		Aluno a = (Aluno) o;
		return this.getId().compareTo(a.getId());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
