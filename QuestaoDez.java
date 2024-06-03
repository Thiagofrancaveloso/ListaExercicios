public class Cachorro {
private String nome;
private String raca;
private double idade;
private String cor;

public Animal (String novoNome, String novaRaca, double novaIdade, String novaCor){
this.nome = novoNome;
this.raca = novaRaca;
this.idade = novaIdade;
this.cor = novaCor;
}
 
public String getNome(){
return nome;
}

public String getRaca(){
return raca;
}

public double getIdade(){
return idade;
}

public String getCor(){
return cor;
}

public void setNome(String novoNome){
this.nome = novoNome;
}

public void setRaca (String novoRaca){
this.raca = novoRaca;
}

public void setIdade (double novaIdade){
this.idade = novaIdade;
}

public void setCor (String novaCor){
this.cor = novaCor;
}
public String Latir (String a){
return a;
}

public String imprimirInformacoes (){
return "au au";

}
}
