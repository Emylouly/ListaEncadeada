package Duplamente;
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.adicionarNoFim("Vitória");
        lista.adicionarNoInicio("Emily");
        lista.adicionarNoInicio("poua");
        lista.adicionarNoInicio("Louise");
        lista.adicionarNoFim("Myllena");
        lista.adicionarNoFim("pou");
        lista.adicionarPorPosicao(1, "galinha");
        //lista.removerPorPosicao(7);

        //lista.removerNoInicio();
        
        //lista.removerNoFim();

        lista.imprimir();



    }

}
