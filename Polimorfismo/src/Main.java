
public class Main {
    public static void main(String[] args) {
        Cachorro a1 = new Cachorro();
        Canguru a2 = new Canguru();

        GoldeFish p1 = new GoldeFish();
        Arara v1 = new Arara();

        Cachorro c1 = new Cachorro();
        Tartaruga t1 = new Tartaruga();


        p1.locomover();
        p1.emitirSom();

        v1.locomover();
        v1.alimentar();

        c1.emitirSom();
        t1.emitirSom();

        a1.locomover();
        a2.locomover();

        a1.alimentar();
        a2.alimentar();

        a1.emitirSom();
        a2.emitirSom();

        c1.reagir("Olá");
        c1.reagir("Vai apanhar");

        c1.reagir(11, 45);
        c1.reagir(21,00);

        c1.reagir(true);
        c1.reagir(false);

        c1.reagir(2, 12.5);
        c1.reagir(17, 4.5);


    }
}