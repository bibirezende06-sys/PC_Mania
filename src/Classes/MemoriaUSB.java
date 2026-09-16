package Classes;

public class MemoriaUSB { // classe

    private String nome; // declarado atributo
    private int capacidade; // declarando atributo

    public MemoriaUSB(String nome, int capacidade) { // construtor
        this.nome = nome; // O atributo "nome" recebe a string informada aqui no construtor
        this.capacidade = capacidade; // O atributo "capacidade" recebe o valor informado aqui no construtor
    }
    public String getNome(){
        return nome;
    } // declarando atributo que retorna o atributo "nome"
    public int getCapacidade(){
        return capacidade;
    } // declarando atributo que retorna o atributo "capacidade"
}
