import java.util.InputMismatchException;
import java.util.Scanner;
//exemplo de tratamento de exceções
public class Main {
    public static int cociente(int numerador, int denominador)throws ArithmeticException{
        return numerador/denominador;
        //aqui foi utilizada a palavra throws para que os clientes da classe saibam que esse metodo eventualmente pode lançar uma exceção ArithmeticException
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;//repete o loop quando as entradas forem inválidas

        do {
            try {
                System.out.println("Entre com o numerador: ");
                int numerador = scanner.nextInt();
                System.out.println("Entre com o denominador: ");
                int denominador = scanner.nextInt();

                int resultado = cociente(numerador,denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);

                continueLoop = false; //Se tudo acontecer dentro dos conformes ele sai do loop
            }
            catch (InputMismatchException erro){
                System.out.println("\nExceção: " + erro);
                scanner.nextInt(); //descarte a entrada para que o usuário tente novamente
                System.out.println("necessário entrar dois números inteiro. Por favor, tente novamente.\n");
            }
            catch (ArithmeticException erro){
                System.out.println("\nExceção: " + erro);
                System.out.println("Zero não é um denominador válido. Por favor, tente novamente.\n");
            }
            System.out.println("Mensagem ainda dentro do loop");
        }while (continueLoop);
        System.out.println("\nMensagem após sair do loop");
    }
}