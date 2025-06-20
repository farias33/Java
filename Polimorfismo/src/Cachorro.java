public class Cachorro extends Mamifero{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void reagir(String frase){
        if(frase == "toma comida" || frase == "Olá"){
            System.out.println("Abanar e latir");
        }else System.out.println("Rosnar");
    }

    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        }else System.out.println("Abanar e Latir");
    }

    public void reagir(boolean dono){
        if(dono) System.out.println("Abanar"); else System.out.println("Rosnar e latir");
    }

    public void reagir(int idade, double peso){
        if (idade < 5){
            if (peso < 10) System.out.println("Abanar"); else System.out.println("Latir");
        }else{
            if (peso<10) System.out.println("Rosnar"); else System.out.println("Ignorar");
        }
    }


    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo ração");
    }

    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
