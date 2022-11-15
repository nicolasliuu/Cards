public class Deck {

    private Card[] cardsArray = new Card[52];

    public Deck() {
        int suitCount = 1; 
        for (int i = 1; i < cardsArray.length + 1; i++) {
            cardsArray[i - 1] = new Card(i % 13, suitCount);
            if (i % 13 == 0) {
                cardsArray[i - 1] = new Card(13, suitCount);
                suitCount += 1;
            }
        }
    } 

    @Override
    public String toString() {
        String deckString = "";
        for (int i = 0; i < 52; i++) {
            deckString = deckString + cardsArray[i] + "\n"; //implicitly calls toString for cardsArray
        }
        return deckString;
    }

}
