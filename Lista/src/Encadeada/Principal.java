package Encadeada;

public class Principal {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        lista.adicionarNoInicio("amor");
        lista.adicionarNoInicio("Pel");
        lista.adicionarNoInicio("Emily");
        lista.adicionarNoFim("myllena");
        lista.adicionarNoFim("Maria");
        lista.adicionarNoFim("erika");


        lista.adiconarPorPosicao(2, "fa");
        lista.removerPorPosicao(4);


        lista.imprimir();

    }

}
