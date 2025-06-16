public class Canguru extends Mamifero{
    private String especie;

    @Override
    public void locomover(){
        System.out.println("Pula");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo plantas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Rosnado");
    }
}
