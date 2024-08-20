package Duplamente;
public class Lista {

    private Celula cabeca;
    private Celula cauda;
    private int totalElementos=0;

    //remover do inicio
    //remover do fim
    //adicionar por posição
    //remover por posição

    public void adicionarNoInicio(String nome){

        if(this.totalElementos==0){

            Celula nova = new Celula(nome);
            this.cabeca = nova;
            this.cauda =nova;

        }

        else{

            Celula nova = new Celula(this.cabeca, null, nome);
            this.cabeca.setAnterior(nova);
            this.cabeca = nova;

        }

        this.totalElementos++;

    }

    public void adicionarNoFim(String nome){

        if(this.totalElementos==0){

            adicionarNoInicio(nome);

        }

        else{

            Celula nova = new Celula(null, this.cauda, nome);
            this.cauda.setProxima(nova);
            this.cauda=nova;

        }

        this.totalElementos++;

    }

    public void removerNoInicio(){

        Celula aux = this.cabeca.getProxima();
        System.out.println(this.cabeca + " " + this.cabeca.getProxima());
        this.cabeca = aux;

        this.totalElementos--;

    }

    public void removerNoFim(){

        Celula aux = this.cauda.getAnterior();
        this.cauda = aux;

        this.totalElementos--;

    }

    public void imprimir(){

        Celula aux = this.cabeca;
		for(int cont=0;cont<this.totalElementos;cont++) {
			System.out.println(aux.getElemento());
			aux = aux.getProxima();
	
		}

    }

}
