public class Card {

   private int rank;
   private int suit;  

   /**
    * Constructs a card with the given rank and suit.
    * @param cardRank
    * @param cardSuit
    */
   public Card (int cardRank, int cardSuit) {
      if (cardRank < 1 || cardRank > 13 || cardSuit < 1 || cardSuit > 4) {
         rank = 0;
         suit = 0;
      }
      else {
         rank = cardRank;
         suit = cardSuit;
      }
   }

   /**
    * Returns the rank of the card.
    * @return rank
    */
   public int getRank() {
      return rank;
   }
   
   /**
    * Returns the suit of the card.
    * @return suit
    */
   public int getSuit() {
      return suit;
   }

   /**
    * Returns a string representation of the card. 
    * Mapping integer rank and suit to string.
    * @return string representation of the card
    */
   @Override
   public String toString() {
      if (suit == 0) {
         return "Invalid Card";
      }
      String newString = "";
      String[] rankArray = {"Ace" , "2", "3", "4", "5", "6", "7", 
         "8", "9", "10", "Jack", "Queen", "King"};
      String[] suitArray = {"Clubs", "Diamonds", "Hearts", "Spades"};
      newString = rankArray[rank - 1] + " of " + suitArray[suit - 1];
      return newString;
   }

   /**
    * Checks if a card is equal to another card.
    * @param other the other Card object to be compared.
    * @return boolean true if the cards are equal, false otherwise.
    */
   @Override
   public boolean equals(Object other) {
      return (((Card)other).getRank() == getRank() && ((Card)other).getSuit() == getSuit());
   }

   /**
    * Compare this Card with the specified otherCard for order.
    * @param otherCard the other Card object to be compared.
    * @return a negative integer, zero, or a positive integer as
    * this object is less than, equal to, or greater than the otherCard.
    */
   public int compareTo(Card otherCard) {
      if (suit < otherCard.getSuit()) {
         return -1;
      }
      else if (suit > otherCard.getSuit()) {
         return 1;
      }
      else {
         if (rank < otherCard.getRank()) {
            return -1;
         }
         else if (rank > otherCard.getRank()) {
            return 1;
         }
         else {
            return 0;
         }
      }
   }
}