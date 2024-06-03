public class Cliente {

	private String nome;
	private String CPF;
	private Data dataNasc;
	
	public Cliente (String novoNome, String novoCPF, Data NovaData) {
		this.nome = novoNome;
		this.CPF = novoCPF;
		this.dataNasc = NovaData;
		}
	
	public String getNome () {
		return nome;
	}
	
	public double getCPF () {
		return CPF;
	}
	
	public void setNome (String novoNome) {
		this.nome = novoNome;
	}
	
	public void setDataNasc (Data NovaData) {
		this.dataNasc = novaData;
	}
}
