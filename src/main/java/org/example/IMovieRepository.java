package org.example;

import java.util.List;
// interface que determina os metodos da classe MovieRepository
public interface IMovieRepository {
    void add(Filme filme);
    void alugar(int id);
    void devolver(int id);
    void delete(int id);
    Filme getFilmeById(int id);
    List<Filme> getAll();
}
