public class Professor {

	private String nome;
	private String departamento;
	private String titulacao;
	
	public Aluno (String novoNome, String novoDepartamento, String novaTitulacao){
		this.nome = novoNome;
		this.departamento = novoDepartamento;
		this.titulacao = novaTitulacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public int getTitulacao() {
		return titulacao;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}
	
	public void setTitulacao(String novaTitulacao) {
		this.titulacao = novaTitulacao;
	}	
}
