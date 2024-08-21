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

            Celula nova = new Celula(nome);
            this.cabeca = nova;
            this.cauda =nova;

        }

        else{

            Celula nova = new Celula(null, this.cauda, nome);
            this.cauda.setProxima(nova);
            this.cauda=nova;

        }

        this.totalElementos++;

    }

    public void removerNoInicio(){

        if(this.totalElementos==0){

            System.out.println("Lista vazia!!");

        }

        else{

            this.cabeca = this.cabeca.getProxima();

            if(this.cabeca != null){

                this.cabeca.setAnterior(null);

            }

            else{

                this.cabeca = null;

            }

        }

        this.totalElementos--;

    }

    public void removerNoFim(){

        if(this.totalElementos ==0){

            System.out.println("Lista vazia!!");

        }

        else{

            this.cauda = this.cauda.getAnterior();

            if(this.cauda != null){

                this.cauda.setProxima(null);

            }

            else{

                this.cauda = null;

            }

        }

        this.totalElementos--;

    }

    public void adicionarPorPosicao(int posicao, String nome){

        if(posicao < 0 || posicao > this.totalElementos){

            throw new IllegalArgumentException("Posição inválida.");

        }
        
        if(posicao == 0){

            adicionarNoInicio(nome);

        }
        
        else if(posicao == this.totalElementos){

            adicionarNoFim(nome);

        }
        
        else{

            Celula atual = this.cabeca;
            
            for(int i = 0; i < posicao - 1; i++){

                atual = atual.getProxima();

            }
            
            Celula nova = new Celula(atual.getProxima(), atual, nome);
            atual.getProxima().setAnterior(nova);
            atual.setProxima(nova);

        }

        this.totalElementos++;


    }

    public void removerPorPosicao(int posicao){

        if(posicao<0 || posicao>=this.totalElementos){

            throw new IllegalArgumentException("Posicao invalida");

        }

        if(posicao==0){

            removerNoInicio();

        }

        else if(posicao==totalElementos){

            removerNoFim();

        }

        else{

            Celula atual = this.cabeca;

            for(int count =0; count<posicao-1;count++){

                atual = atual.getProxima();

            }

            atual.getAnterior().setProxima(atual.getProxima());
            atual.getProxima().setAnterior(atual.getAnterior());


        }

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
