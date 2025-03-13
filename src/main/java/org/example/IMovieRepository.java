package org.example;

import java.util.List;

public interface IMovieRepository {
    void add(Filme filme);
    void alugar(int id);
    void devolver(int id);
    void delete(int id);
    Filme getFilmeById(int id);
    List<Filme> getAll();
}
