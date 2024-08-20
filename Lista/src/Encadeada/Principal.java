package Encadeada;

public class Principal {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        lista.adicionarNoInicio("amor");
        lista.adicionarNoInicio("Pel");
        lista.adicionarNoInicio("\nEmily");

        lista.adicionarNoFim("myllena");

        lista.removerFim();

        lista.adicionarNoFim("Maria");
        lista.adicionarNoFim("erika");
        
        lista.adiconarPorPosicao(2, "2412454");


        lista.imprimir();

    }

}
