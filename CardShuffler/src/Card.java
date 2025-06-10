public class Card {
    private String face;
    private String naipe;

    public Card(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }


    @Override
    public String toString() {
        return this.face + "de " + this.naipe;
    }
}
