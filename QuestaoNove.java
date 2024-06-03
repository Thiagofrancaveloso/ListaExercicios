public class Cliente {

	private String nome;
	private String CPF;
	private String dataNascimento;
	
	public Cliente (String novoNome, String novoCPF, String novaDataNascimento) {
		this.nome = novoNome;
		this.CPF = novoCPF;
		this.dataNascimento = novaDataNascimento;
		}
	
	public String getNome () {
		return nome;
	}
	
	public double getCPF () {
		return CPF;
	}
	
	public double getDataNascimento () {
		return dataNascimento;
	}
	
	public void setNome (String novoNome) {
		this.nome = novoNome;
	}
	
	public void setCPF (String novoCPF) {
		this.CPF = novoCPF;
	}
	
	public void setDataNascimento (int novoDataNascimento) {
		this.dataNascimento = novoDataNascimento;
	}
}
