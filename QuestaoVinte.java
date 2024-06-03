public class Empresa {

	private String nome;
	private String cnpj;
	
	public Empresa (String novoNome, String novoCNPJ){
		this.nome = novoNome;
		this.cnpj = novoCNPJ;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCNPJ() {
		return cnpj;
	}
	
	public void setNome (String novoNome) {
		this.nome = novoNome;
	}
	
	public void setCNPJ (String novoCNPJ) {
		this.cnpj = novoCNPJ;
	}
}
