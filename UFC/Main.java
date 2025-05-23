/*
 * */
public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Justin ", "Masculino","EUA", 22, 1.82f, 91.5f, 10, 5, 1);
        l[1] = new Lutador("Jon Jones", "Masculino","Islandia", 33, 1.80f, 90.1f, 3, 10, 9);
        l[2] = new Lutador("Valeria", "Feminino","Brasil", 28, 1.97f, 77.1f, 1, 2, 10);
        l[3] = new Lutador("Joao", "Masculino","Qatar", 52, 1.90f, 82f, 20, 9, 6);
        l[4] = new Lutador("Alice", "Feminino","Russia", 36, 1.63f, 62.1f, 9, 2, 8);
        l[5] = new Lutador("Julia", "Feminino","Australia", 22, 1.70f, 63.2f, 20, 0, 0);


        Luta UFC01 = new Luta();
        Luta UFC02 = new Luta();

        UFC01.marcarLuta(l[4], l[5]);
        UFC01.luta();

        UFC02.marcarLuta(l[0], l[1]);
        UFC02.luta();


    }
}