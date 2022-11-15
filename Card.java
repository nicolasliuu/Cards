public class Card {

   private int rank;
   private int suit;  

   /**
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

   public int getRank() {
      return rank;
   }


   
   public int getSuit() {
      return suit;
   }

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

   @Override
   public boolean equals(Object other) {
      if (((Card)other).getRank() == getRank() && ((Card)other).getSuit() == getSuit()) {
         return true;
      }
      else {
         return false;
      }
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