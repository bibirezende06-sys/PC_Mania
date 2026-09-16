package Classes;

public class Cliente { // classe

    private String nome; // declarado atributo
    private String cpf; // declarando atributo
    private Computador[] computadores; // declarado atributo

    public Cliente(String nome, String cpf, Computador[] computadores) // construtor da classe Cliente
    {
        this.nome = nome; // O atributo "nome" recebe o nome informado aqui no construtor
        this.cpf = cpf; // O atributo "cpf" recebe o cpf informado aqui no construtor
        this.computadores = computadores; // O atributo "computadores" recebe o array informado aqui no construtor
    }

    public float calculaTotalCompra() // declarando metodo
    {
        float total = 0; // contador que calcula a soma total da compra

        for (int i = 0; i < computadores.length; i++){
            if (computadores[i] != null){
                total = total + computadores[i].getPreco(); // calculo do total da compra
            }
        }
        return total;
    }

    public String getNome(){
        return nome;
    } // declarando atributo que retorna o atributo "nome"

    public String getCpf(){
        return cpf;
    } // declarando atributo que retorna o atributo "cpf"
}
