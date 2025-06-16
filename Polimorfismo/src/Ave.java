public abstract class Ave extends Animal{
    private String corPena;
    private String fazerNinho;

    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Ciscas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Piar");
    }
}
