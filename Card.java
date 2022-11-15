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
      String newString = "";
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

}