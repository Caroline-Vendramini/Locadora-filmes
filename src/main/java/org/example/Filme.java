package org.example;

public class Filme {
    //atributos de um filme
    private String nome;
    private int ano;
    private boolean estaAlugado;
    private int id;

    Filme(String nome, int ano, int id){
        //construtor
        this.ano = ano;
        this.nome = nome;
        this.id = id;
        this.estaAlugado = false;
    }
    //comportamentos
    public boolean getEstaAlugado(){
        return estaAlugado;
    }
    public void setEstaAlugado(boolean value){
        estaAlugado = value;
    }
    // @Override sobrescrevendo (polimorfismo) o metodo nativo toString
    @Override
    public String toString(){
        return "Filme: " + nome + ", id: " + id + ", está alugado: " + (estaAlugado ? "Sim" : "Não") + ", ano: " + ano;
    }

    public int getId() {
        return id;
    }
}
