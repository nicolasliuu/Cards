public class TestCard {
    
    public static void main(String[] args) {

        public static void assertEquals(int exp, int act, String dsc) {
            if (exp == act) {
               System.out.println("PASS: " + dsc);
            } else {
               System.out.println("FAIL: " + dsc);
            }
        }

        // Constructing card object1 with valid parameters
        Card card1 = new Card(1, 1);
        // Constructing card object2 with valid rank, invalid suit
        Card card2 = new Card(2, 0);
        // Constructing card object3 with invalid rank, valid suit
        Card card3 = new Card(-3, 2);
        // Constructing card object4 with invalid rank and invalid suit
        Card card4 = new Card(-123, 234);
        // Getting rank and suit for object1
        
        System.out.println(card1.getSuit());
        System.out.println(card1.getRank());

        // Getting rank and suit for object2

        System.out.println(card2.getSuit());
        System.out.println(card2.getRank());

        // Getting rank and suit for object3

        System.out.println(card3.getSuit());
        System.out.println(card3.getRank());

        // Getting rank and suit for object4

        System.out.println(card4.getSuit());
        System.out.println(card4.getRank());

        // Testing toString method by printing cards 1 through 4
        
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);

    }

}