public class Animal {
private String nome;
private String tipo;
private String somAnimal;

public Animal (String novoNome, String novoTipo, String novoSomAnimal){
this.nome = novoNome;
this.tipo = novoTipo;
this.somAnimal = novoSomAnimal
}

public String getNome(){
return nome;
}
public String getTipo(){
return tipo;
}

public String getSomAnimal(){
return somAnimal;
}

public void setNome(String novoNome){
this.nome = novoNome;
}

public void setTipo (String novoTipo){
this.tipo = novoTipo;
}

public void somAnimal(){
this.somAnimal = novoSomAnimal;
}

public String Emitir(String a){
return a;
}

public String imprimirInformacoes (){
return "O som é" + this.somAnimal;
}
}
