import java.util.Random;

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

    public void shuffle() {
        Random rand = new Random();
        Card[] copy = cardsArray;
        int k = 51;
        for (int i = 0; i < 52; i++) {
            int j = rand.nextInt(k + 1);
            cardsArray[i] = copy[j];
            copy[j] = copy[k];
            k--;
        }
    }

    public void sort() {
        for (int j = 0; j < 52; j++) {
            Card c = cardsArray[j];
            int i = j - 1;
            while (i >= 0 && cardsArray[i].compareTo(c) == 1) {
                cardsArray[i + 1] = cardsArray[i];
                i--;
            }
            cardsArray[i + 1] = c;
        }
    }


}
