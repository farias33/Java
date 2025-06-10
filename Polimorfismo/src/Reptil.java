public abstract class Reptil extends Animal{
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejar");
    }
    @Override
    public void alimentar(){

    }

    @Override
    public void emitirSom(){
        System.out.println("Xiado");
    }

}
