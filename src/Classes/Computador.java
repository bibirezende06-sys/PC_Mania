package Classes;

public class Computador { // classe

    private String marca; // declarando atributo
    private float preco; // declando atributo

    private MemoriaUSB memoriaUSB; // fazendo associacao
    private SistemaOperacional so; // fazendo associacao
    private HardwareBasico[] hard; // fazendo associacao



    public Computador(String marca, float preco, HardwareBasico[] hard, SistemaOperacional so) { // construtor

        this.marca = marca; // O atributo "marca" recebe a string informada aqui no construtor
        this.preco = preco; // O atributo "preco" recebe o valor informado aqui no construtor
        this.hard = hard; // O atributo "hard" recebe as informacoes informadas aqui no construtor
        this.so = so; // O atributo "so" recebe as informacoes informadas aqui no construtor

    }

    public void mostraPCConfigs() // declarando metodo
    {

        // saida das informacoes
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$  " + preco);
        System.out.println("Sistema Operacional: " + so.getNome());
        System.out.println("Tipo: " + so.getTipo() + " bits");
        System.out.println("Hardware Básico: ");

        for (int i = 0; i < hard.length; i++){

            System.out.println(hard[i].getNome() + " - " + hard[i].getCapacidade());
        }
        if (memoriaUSB != null){

            System.out.println("Memória USB: " + memoriaUSB.getNome());
            System.out.println("Capacidade: " + memoriaUSB.getCapacidade() + " GB");
        }

    }
    public void addMemoriaUSB(MemoriaUSB musb)
    {
        this.memoriaUSB = musb;
    } // declarando metodo
    public float getPreco(){
        return preco;
    } // declarando atributo que retorna o atributo "preco"

}
