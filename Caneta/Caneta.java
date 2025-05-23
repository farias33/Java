public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String m, String c, float p) { //Metodo construtor
        this.modelo = m;
        this.tampar();
        this.cor = c;
        this.ponta = p;

    }

    public String getModelo(){ //No caso de eu precisar retornar algo, como aqui no getter, o metodo não pode ser void
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public Float getPonta(){
        return this.ponta;
    }

    public void setPonta(Float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = false;

    }
    public void destampar(){
        this.tampada = true;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
