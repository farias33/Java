import java.util.Random;

public class DeckofCards {

    private Card[] deck; //array de objetos do tipo Card
    private int currentCard; //índice da próxima carta a ser distribuída
    private static final int NUMBER_OF_CARDS = 52; // número de cartas no baralho
    private static final Random randomNum = new Random(); // gerador aleatório

    //construtor que inicializa o baralho de cartas
    public DeckofCards() {
        String[] faces = {"As " , "Dois " , "Tres " , "Quatro " , "Cinco " , "Seis " , "Sete " , "Oito " , "Nove " , "Dez " , "Valete " , "Dama" , "Rei"};
        String[] naipes = {"Ouros", "Espada", "Copas", "Paus"};

        this.deck = new Card[NUMBER_OF_CARDS]; // inicializa o deck com o tamanho de cartas padrão(52 cartas)
        this.currentCard = 0; // a primeira carta distribuída é deck[0]

        //preenche baralho com objeto Card
        for (int i = 0; i< deck.length;i++){
            deck[i] = new Card(faces[i % 13], naipes[i / 13]);
        }
    }

    public void shuffle(){
        currentCard = 0; // reinicia currentCard
        for (int first = 0; first < deck.length ; first++){
            //Seleciona um número aleatório entre 0 e 51
            int second = randomNum.nextInt(NUMBER_OF_CARDS);

            //compara card atual com card aleatório
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //distribui um carta
    public Card dealCard(){
        //determina se ainda há cartas a serem distribuídas
        if (currentCard<deck.length)
            return deck[currentCard++]; //retorna carta atual no array
        else return null; //indica que todas as cartas foram distribuídas
    }

}
