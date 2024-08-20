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

        Celula nova = new Celula(nome);
        this.cauda.setProxima(nova);
        this.cauda = nova;

        if(totalElementos==0){

            this.cabeca = nova;

        }

        this.totalElementos++;

    }



    public void adiconarPorPosicao(int posicao, String nome) {
		
		Celula anterior = this.cabeca;
		
		if(posicao>this.totalElementos || posicao<0) {
	
			throw new IllegalArgumentException("posição fora do intervalo válido");
			
		}
		
		for(int cont=0;cont<posicao-1;cont++) {
			
			anterior = anterior.getProxima();

		}
		
		Celula nova = new Celula(anterior.getProxima(),nome);
		anterior.setProxima(nova);
		this.totalElementos++;

    }



    public void removerInicio() {
	
        Celula aux = this.cabeca;

        this.cabeca = null;
        this.cabeca = aux.getProxima();

        this.totalElementos--;

		
		
	}



    public void removerFim() {
		
		Celula anterior = this.cabeca;
		
		for(int cont=0;cont<this.totalElementos-2;cont++) {
			
			anterior = anterior.getProxima();
			
		}
		
		this.cauda = null;
        anterior.setProxima(null);
        this.cauda = anterior;
		
		this.totalElementos--;
	}

    public void removerPorPosicao(int posicao) {
	
		Celula anterior = this.cabeca;
		
		if(this.totalElementos==1) {
			removerInicio();
		}

        if(posicao == totalElementos){

            removerFim();

        }
		
		for(int cont=0;cont<posicao-1;cont++) {
			

			anterior = anterior.getProxima();
			//System.out.println(cont);

            System.out.println(anterior.getElemento());

		}


        anterior.setProxima(anterior.getProxima().getProxima());

		this.totalElementos--;
	}

    public void imprimir(){

        Celula aux = this.cabeca;
        for(int count=0; count<this.totalElementos; count++){

            System.out.println("Elemento:" + aux.getElemento());
            aux = aux.getProxima();

        }

    }


}
