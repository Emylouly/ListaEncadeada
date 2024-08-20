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

    public void imprimir(){

        Celula aux = this.cabeca;
		for(int cont=0;cont<this.totalElementos;cont++) {
			System.out.println(aux.getElemento());
			aux = aux.getProxima();
	
		}

    }

    public Celula getCabeca() {
        return cabeca;
    }

    public void setCabeca(Celula cabeca) {
        this.cabeca = cabeca;
    }

    public Celula getCauda() {
        return cauda;
    }

    public void setCauda(Celula cauda) {
        this.cauda = cauda;
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public void setTotalElementos(int totalElementos) {
        this.totalElementos = totalElementos;
    }

}
