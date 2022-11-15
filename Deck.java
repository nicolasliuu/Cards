public class Deck {

    private Card[] cardsArray = new Card[52];

    public Deck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardsArray[(i + 1) * (j + 1) - 1] = new Card(j, i);
            }
        }
    }

    @Override
    public String toString() {
        String deckString = "";
        for (int i = 0; i < 52; i++) {
            deckString = cardsArray[i].toString() + "\n";
        }
        return deckString;
    }

}
