package org.example;

public class Main {

    public static void main(String[] args) {
        //instanciando um objeto da classe MovieRepository, permitindo "chamar"os metodos da classe MovieRepository
        MovieRepository repository = new MovieRepository();
        while (true){
            System.out.println("\n\n1 - Adicionar | 2 - Listar | 3 - Alugar | 4 - Devolver | 5 - Excluir | 0 - Sair");
            int opcao = ConsoleInput.readInt("Opção: ");

            if(opcao == 1){
                String nome = ConsoleInput.readString("Nome do filme: ");
                int ano = ConsoleInput.readInt("Ano de lançamento do filme: ");
                int id = (int) (Math.random() * 1000); //Math.random() gera numero de 0 ate 1.
                Filme novoFilme = new Filme(nome, ano, id);
                repository.add(novoFilme);
            }else if(opcao == 2){
                repository.getAll().forEach(System.out::println); //forEach para cada filme,imprimir.
            }else if(opcao == 3){
                int id = ConsoleInput.readInt("Digite o id do filme: ");
                repository.alugar(id);
            }else if(opcao == 4){
                int id = ConsoleInput.readInt("Digite o id do filme: ");
                repository.devolver(id);
            }else if(opcao == 5){
                int id = ConsoleInput.readInt("Digite o id do filme: ");
                repository.delete(id);
            }else if(opcao == 0){
                break;
            }else {
                System.out.println("Opção inválida.");
            }
        }
    }
}