/*
* */
public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Marcos", 22, "M");
        p[1] = new Pessoa("Flavia", 24, "F");

        l[0] = new Livro("Learning Python", "Thales", 800,p[0]);
        l[1] = new Livro("Learning Java", "Febonebo", 1200,p[1]);


        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}