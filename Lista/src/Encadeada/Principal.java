package Encadeada;

public class Principal {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        lista.adicionarNoInicio("amor");
        lista.adicionarNoInicio("Pel");
        lista.adicionarNoInicio("Emily");
        //lista.adicionarNoFim("myllena");
        //lista.adicionarNoFim("erika");

        //lista.adicionarNoFim("Maria");

        //lista.adicionarPorPosicao(2, "fa");
        lista.removerFim();


        lista.imprimir();

    }

}
