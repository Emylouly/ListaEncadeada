package Duplamente;
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.adicionarNoFim("Vitóriat");
        lista.adicionarNoFim("Myllenat");

        lista.adicionarNoInicio("Emilyt");
        lista.adicionarNoInicio("Louise t");

        lista.removerNoInicio();
        
        lista.removerNoFim();

        lista.imprimir();



    }

}
