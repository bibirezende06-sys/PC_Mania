package Classes;

public class SistemaOperacional { // classe

    private String nome; // declarando atributo
    private int tipo; // declarado atributo

    public SistemaOperacional(String nome, int tipo) { // construtor
        this.nome = nome; // O atributo "nome" recebe a string informada aqui no construtor
        this.tipo = tipo; // O atributo "tipo" recebe o valor informado aqui no construtor
    }
    public String getNome(){
        return nome;
    } // declarando atributo que retorna o atributo "nome"
    public int getTipo(){
        return tipo;
    } // declarando atributo que retorna o atributo "tipo"
}
