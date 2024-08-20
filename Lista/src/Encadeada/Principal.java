package Encadeada;

public class Principal {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        lista.adicionarNoInicio("Pel");
        lista.adicionarNoInicio("amor");
        lista.adicionarNoFim("myllena");
        lista.adicionarNoFim("Maria");
        lista.adicionarNoFim("erika");
        lista.adicionarNoInicio("Emily");

        lista.imprimir();

    }

}
