package org.example;

public class Filme {
    //atributos de um filme
    private String nome;
    private int ano;
    private boolean estaAlugado;
    private int id;

    Filme(String nome, int ano, int id){
        this.ano = ano;
        this.nome = nome;
        this.id = id;
        this.estaAlugado = false;
    }
    public boolean getEstaAlugado(){
        return estaAlugado;
    }
    public void setEstaAlugado(boolean value){
        estaAlugado = value;
    }
    @Override
    public String toString(){
        return "Filme: " + nome + ", id: " + id + ", está alugado: " + (estaAlugado ? "Sim" : "Não") + ", ano: " + ano;
    }

    public int getId() {
        return id;
    }
}
