/*
Neste estudo de caso criaremos uma classe para representar cartas de um
baralho e simular o embaralhamento e distribuição de cartas, depois essa
classe pode ser utilizada na implementação de aplicativos para jogos de cartas
específicos.

Para essa simulação implementaremos uma classe chamada Card que
representa uma carta de baralho com face e um naipe.

Em seguida desenvolveremos a classe DeckOfCards que cria um baralho de 52
cartas, sendo que cada elemento é um objeto Card e ent˜ao um aplicativo de
teste é criado.
*/
public class Main {
    public static void main(String[] args) {
        DeckofCards myDeck = new DeckofCards();
        myDeck.shuffle(); //coloca as cartas em ordem aleatória

        //imprime as 52 cartas na ordem em que estão distribuídas
        for (int i = 1; i < 53; i++){
            System.out.printf("%-19s", myDeck.dealCard());
            if (i % 4 == 0) System.out.println();
        }

    }
}