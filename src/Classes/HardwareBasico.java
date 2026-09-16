package Classes;

public class HardwareBasico { // classe

    private String nome; //declarando atributo
    private float capacidade; // declarado atributo

    public HardwareBasico(String nome, float capacidade) { // construtor
        this.nome = nome; // O atributo "nome" recebe a string informada aqui no construtor
        this.capacidade = capacidade; // O atributo "capacidade" recebe o valor informado aqui no construtor
    }
    public  String getNome(){
        return nome;
    } // declarando atributo que retorna o atributo "nome"
    public float getCapacidade(){
        return capacidade;
    } // declarando atributo que retorna o atributo "capacidade"
}
