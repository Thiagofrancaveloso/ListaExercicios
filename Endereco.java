public class Endereco {

	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco (String novaRua, int novoNumero, String novoBairro, String novaCidade, String novoEstado, String novoCEP){
		this.rua = novaRua;
		this.numero = novoNumero;
		this.bairro = novoBairro;
		this.cidade = novaCidade;
		this.estado = novoEstado;
		this.cep = novoCEP;
	}
	
	public String getRua() {
		return rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getCEP() {
		return cep;
	}
	
	public void setRua(String novaRua) {
		this.rua = novaRua;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public void setBairro(String novoBairro) {
		this.bairro = novoBairro;
	}
	
	public void setCidade(String novaCidade) {
		this.cidade = novaCidade;
	}
	
	public void setEstado(String novoEstado) {
		this.estado = novoEstado;
	}
}
