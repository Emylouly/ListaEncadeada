package Duplamente;
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.adicionarNoFim("Vitória");
        lista.adicionarNoFim("Myllena");

        lista.adicionarNoInicio("Emily");
        lista.adicionarNoInicio("Louise");

        //lista.removerNoInicio();
        
        lista.removerNoFim();

        lista.imprimir();



    }

}
