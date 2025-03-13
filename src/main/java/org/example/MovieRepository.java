package org.example;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements IMovieRepository {
    private List<Filme> prateleira = new ArrayList<>();

    @Override
    public void add(Filme filme) {
        prateleira.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    @Override
    public void alugar(int id) {
        Filme filme = getFilmeById(id);
        if(filme == null){
            System.out.println("Filme não cadastrado.");
            return;
        }
        boolean estaAlugado = filme.getEstaAlugado();
        if(estaAlugado){
            System.out.println("Filme não disponível no momento.");
            return;
        }
        filme.setEstaAlugado(true);
        System.out.println("Filme alugado com sucesso!");
    }

    @Override
    public void devolver(int id) {
        Filme filme = getFilmeById(id);
        if(filme == null){
            System.out.println("Filme não cadastrado.");
            return;
        }
        boolean estaAlugado = filme.getEstaAlugado();
        if(!estaAlugado){
            System.out.println("Filme não está alugado.");
            return;
        }
        filme.setEstaAlugado(false);
        System.out.println("Filme devolvido com sucesso!");
    }

    @Override
    public Filme getFilmeById(int id) {
        for (Filme filme: prateleira){
            if(filme.getId() == id){
                return filme;
            }
        }
        return null;
    }

    @Override
    public List<Filme> getAll() {
        return prateleira;
    }

    @Override
    public void delete(int id) {
        Filme filme = getFilmeById(id);
        if(filme == null){
            System.out.println("Filme não cadastrado.");
            return;
        }

        prateleira.removeIf(filmePrateleira -> filmePrateleira.getId() == id);
        System.out.println("Filme excluído com sucesso!");
    }
}
