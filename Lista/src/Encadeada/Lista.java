package Encadeada;

public class Lista {

    private Celula cabeca;
    private Celula cauda;
    private int totalElementos;

    public void adicionarNoInicio(String nome){

        Celula nova = new Celula(this.cabeca, nome);
        this.cabeca = nova;

        if(totalElementos==0){

            this.cauda = nova;

        }

        this.totalElementos++;

    }

    public void adicionarNoFim(String nome){

        Celula nova = new Celula(this.cauda, nome);
        this.cauda.setProxima(nova);
        this.cauda = nova;

        if(totalElementos==0){

            this.cabeca = nova;

        }

        totalElementos++;

    }

    public void imprimir(){

        Celula aux = this.cabeca;
        for(int count=0; count<totalElementos; count++){

            System.out.println("Elemento:" + aux.getElemento());
            aux = aux.getProxima(); 

        }


    }

}
