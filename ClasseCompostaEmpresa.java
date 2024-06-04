public class Empresa {

	private Funcionario funcionario;
	private String cnpj;
	private Endereco endereco;
	private String dataDeCriacao;
	
	public Empresa(Funcionario novoFuncionario, String novoCnpj, Endereco novoEndereco, String novaDataDeCriacao) {
    this.funcionario = novoFuncionario;
    this.cnpj = novoCnpj;
    this.endereco = novoEndereco;
    this.dataDeCriacao = novaDataDeCriacao;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getDataDeCriacao() {
		return dataDeCriacao;
	}

	public String toString() {
		return "Funcionario: " + this.funcionario + "\nCNPJ: " + this.cnpj + "\nEndereço da Empresa: " + this.endereco + "\nData de Criação da empresa: " + this.dataDeCriacao;
	}
}
