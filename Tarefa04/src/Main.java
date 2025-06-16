// por isso a tabela[i][j] inicializa em zero, pois ela soma um na quantidade de vezes que aquela combinação aconteceu de forma aleatória a vez 36.000
//entendi!!!!
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //int dado1 = random.nextInt(6) + 1;//Como é de 0 a 5 soma um em qualquer resultado para funcionar como um dado.
        //int dado2 = random.nextInt(6) + 1;//random.nextInt(n) gera um inteiro aleatorio entre 0 e n.
        int[][] tabela = new int[6][6];

        for (int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                tabela[i][j] = 0;
            }
        }

        for (int i = 1; i < 36000; i++){
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            tabela[dado1 - 1][dado2 - 1] += 1;//O '-1' serve para ajustar os valores dos dados para posição na matriz, pois o java eh burro e não conseguiria ler
        }

        // Supondo que 'matriz' seja um int[6][6] já preenchido com as contagens
        System.out.print("    ");  // Espaço para o canto superior esquerdo
        for (int col = 1; col <= 6; col++) {
            System.out.printf("%10d", col);  // Cabeçalho das colunas com espaçamento
        }
        System.out.println();

        for (int linha = 0; linha < 6; linha++) {
            System.out.printf("%2d  ", linha + 1);  // Cabeçalho das linhas
            for (int col = 0; col < 6; col++) {
                System.out.printf("%10d", tabela[linha][col]);  // Espaço fixo para cada número
            }
            System.out.println();
        }

// É printado o número de vezes que cada possível soma aparece

    }
}