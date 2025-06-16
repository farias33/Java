/*Realizar testes chamando os métodos e criando novos cliente com diferentes tipos de contas
 * */
public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Thales Fortes");
        p1.abrirConta("CC");
        p1.depositar(500);
        p1.sacar(100);
        p1.fecharConta();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Ligia Alves");
        p2.abrirConta("CP");
        p2.depositar(800);
        p2.sacar(100);
        p2.sacar(5000);



        p1.estadoAtual();
        p2.estadoAtual();
    }
}