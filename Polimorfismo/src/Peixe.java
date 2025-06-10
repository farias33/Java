public abstract class Peixe extends Animal{
    private String corEscama;
    private boolean soltarBolha;

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){

    }

    @Override
    public void emitirSom(){
        System.out.println("BlupBlup");
    }
}
