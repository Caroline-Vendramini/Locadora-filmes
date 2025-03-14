package org.example;

import java.util.ArrayList;
import java.util.List;
// manipula as informacoes do filme salvando em uma lista. I = interface
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
    // busca filme pelo id
    @Override
    public Filme getFilmeById(int id) {
        for (Filme filme: prateleira){
            if(filme.getId() == id){
                return filme;
            }
        }
        return null;
    }
    // gelAll busca todos os filmes da lista
    @Override
    public List<Filme> getAll() {
        return prateleira;
    }
    // delete deleta o filme do id recebido como parametro
    @Override
    public void delete(int id) {
        Filme filme = getFilmeById(id);
        if(filme == null){
            System.out.println("Filme não cadastrado.");
            return;
        }
        // deleta se o id for igual ao id recebido como parametro
        prateleira.removeIf(filmePrateleira -> filmePrateleira.getId() == id);
        System.out.println("Filme excluído com sucesso!");
    }
}
