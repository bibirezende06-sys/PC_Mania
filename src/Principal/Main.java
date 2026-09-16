package Principal;

import Classes.*;
import Finalizacao.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int matricula = 837;

        // ============================
        // Promoção 1 :)
        // ============================

        HardwareBasico[] hard1 = new HardwareBasico[3]; // declarando instancia

        hard1[0] = new HardwareBasico("Pentium Core i5",2200);
        hard1[1] = new HardwareBasico("Memória RAM", 8);
        hard1[2] = new HardwareBasico("HD", 500);

        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia",64); // declarando instancia

        Computador pc1 = new Computador("Apple",matricula,hard1,so1); // declarando instancia

        MemoriaUSB memoria1 = new MemoriaUSB("Pen-drive",16); // declarando instancia

        pc1.addMemoriaUSB(memoria1); // associacao

        // ============================
        // Promoção 2 :)
        // ============================

        HardwareBasico[] hard2 = new HardwareBasico[3]; // declarando instancia

        hard2[0] = new HardwareBasico("Pentium Core i7",3370);
        hard2[1] = new HardwareBasico("Memória RAM",16);
        hard2[2] = new HardwareBasico("HD",1000);

        SistemaOperacional so2 = new SistemaOperacional("Windows 8",64); // declarando instancia

        Computador pc2 = new Computador("Samsung",matricula,hard2,so2); // declarando instancia

        MemoriaUSB memoria2 = new MemoriaUSB("Pen-drive",32); // declarando instancia

        pc2.addMemoriaUSB(memoria2); // associacao

        // ===========================
        // Promoção 3 :)
        // ===========================

        HardwareBasico[] hard3 = new HardwareBasico[3]; // declarando instancia

        hard3[0] = new HardwareBasico("Pentium Core i7",4500);
        hard3[1] = new HardwareBasico("Memória RAM",32);
        hard3[2] = new HardwareBasico("HD",2000);

        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64); // declarando instancia

        Computador pc3 = new Computador("Dell",matricula,hard3,so3); // declarando instancia

        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo",1000); // declarando instancia

        pc3.addMemoriaUSB(memoria3); // associacao

        // ============================
        //Cliente ;)
        // ============================

        Computador[] computadoresComprados = new Computador[10]; // declarando array que armazena os computadores comprados

        Cliente cliente = new Cliente("Ane","146.253.276-44",computadoresComprados); // declarando instancia

        // ============================
        //Compra :)
        // ============================

        int opcao = -1;
        int posicao = 0;

        while(opcao != 0)
        {
            // fazendo cabecalho
            System.out.println();
            System.out.println(">>>>>> PC Mania <<<<<<");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar compra");

            System.out.println("Digite sua opção: ");
            opcao = teclado.nextInt(); // usuario digita a opcao que ele deseja

            // indicando resultado para cada opcao digitada
            if(opcao == 1)
            {
                computadoresComprados[posicao] = pc1; // associado o computador ao cliente
                posicao++; // passando para a proxima posicao do array

                System.out.println("Promoção 1 adicionada!");
            }
            else if(opcao == 2)
            {
                computadoresComprados[posicao] = pc2; // associado o computador ao cliente
                posicao++; // passando para a proxima posicao do array

                System.out.println("Promoção 2 adicinada!");
            }
            else if(opcao == 3)
            {
                computadoresComprados[posicao] = pc3; // associado o computador ao cliente
                posicao++; // passando para a proxima posicao do array

                System.out.println("Promoção 3 adicinada!");
            }
            else if(opcao == 0)
            {
                System.out.println("Compra finalizada!");
            }else{
                System.out.println("Opção inválida!");
            }
        }

        // ============================
        //Mostrar cliente :)
        // ============================

        // mostrando dados do cliente
        System.out.println();
        System.out.println("====== Cliente ======");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());


        // Mostrando os PCs comprados
        System.out.println();
        System.out.println(" ====== Computadores comprados ======");

        for (int i = 0; i < computadoresComprados.length; i++) // percorrendo array dos computadores comprados
        {
            if(computadoresComprados[i] != null) //
            {
                System.out.println();
                System.out.println("Computador "+ (i + 1)); // mostrando o computador de acordo com a posicao dele no array

                computadoresComprados[i].mostraPCConfigs();
            }
        }

        // Mostrado o total da compra
        System.out.println();
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());

        // Processando Pedido

        ProcessarPedido.processar(computadoresComprados);

        teclado.close();

    }
}
