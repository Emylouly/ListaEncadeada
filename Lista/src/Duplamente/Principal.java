package Duplamente;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        Lista lista = new Lista();
        int opcao=1, posicao;

        do{

            System.out.println("\nEscolha a opção desejada: ");
            System.out.println("1- Listar elementos;\n2- Adicionar no inicio;\n3- Adicionar no fim;\n4- Remover no inicio;\n5- Remover no fim;\n6- Adicionar por posição;\n7- Remover por posição;\n8- Sair da operação.");
            System.out.print("\nFaça a sua escolha:");
            opcao=input.nextInt();

            switch (opcao) {
                case 1:

                        System.out.println("\nListando nomes:\n");
                        lista.imprimir();
                        break;

                case 2:

                        System.out.print("\nDigite um nome para ser adicionado no inicio: ");
                        nome = input.next();
                        lista.adicionarNoInicio(nome);
                        break;

                case 3:

                        System.out.print("\nDigite um nome para ser adicionado no fim: ");
                        nome = input.next();
                        lista.adicionarNoFim(nome);
                        break;
                
                case 4:

                        System.out.println("\nRemovido elemento do inicio!");
                        lista.removerNoInicio();
                        break;

                case 5:

                        System.out.println("\nRemovido elemento do fim!!");
                        lista.removerNoFim();
                        break;

                case 6:

                        System.out.println("\nAdicione por posição!!");
                        System.out.print("\nDigite o numero da posição desejada: ");
                        posicao=input.nextInt();
                        System.out.print("\nDigite um nome para ser adicionado: ");
                        nome=input.next();
                        lista.adicionarPorPosicao(posicao, nome);
                        break;
                case 7:

                        System.out.print("\nDigite a posição que você quer remover: ");
                        posicao=input.nextInt();
                        lista.removerPorPosicao(posicao);
                        break;
                
                case 8:

                        System.out.println("\n\nSaindo...");
                        opcao=0;
                        break;
                        
                default:

                        System.out.println("\n\nOpção invalida!!\n\n");
            }


        }while(opcao!=0);

        //lista.adicionarNoFim("Myllena");
        //lista.adicionarNoFim("pou");
        //lista.adicionarNoFim("Vitória");
        //lista.adicionarNoInicio("Louise");
        //lista.adicionarNoInicio("Emily");
        //lista.adicionarNoInicio("poua");

        //lista.adicionarPorPosicao(0, "galinha");
        //lista.removerPorPosicao(0);

        //lista.removerNoInicio();
        
        //lista.removerNoFim();

        //lista.imprimir();



    }

}
