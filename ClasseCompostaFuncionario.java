public class Funcionario {

	private String nome;
	private String CPF;
	private Data data;
	private Endereco endereco;
	
	public Funcionario(String novoNome, String novoCPF, Data novaData, Endereco novoEndereco) {
		this.nome = novoNome;
		this.CPF = novoCPF;
		this.data = novaData;
		this.endereco = novoEndereco;
		}
	
	public String getNome () {
		return nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setNome (String novoNome) {
		this.nome = novoNome;
	}
	
	public void setDataNasc (Data novaData) {
		this.data = novaData;
	}
	
	public void setEndereco (Endereco novoEndereco) {
		this.endereco = novoEndereco;
	}
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.CPF + "\nData Nascimento: " + this.data + "\nEndereço: " + this.endereco;
	}
}
