package Duplamente;
public class Celula {
    
    private Celula proxima;
    private Celula anterior;
    private Object elemento;

    public Celula(Celula proxima, Celula anterior, Object elemento){

        super();
        this.proxima = proxima;
        this.anterior = anterior;
        this.elemento = elemento;


    }

    public Celula(Celula proxima, Object elemento){

        this.proxima = proxima;
        this.elemento = elemento;

    }

    public Celula(Object elemento){

        this.elemento = elemento;

    }

    public Celula(){}

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Celula [proxima=" + proxima + ", anterior=" + anterior + ", elemento=" + elemento + "]";
    }

    

}
