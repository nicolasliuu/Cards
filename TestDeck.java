public class TestDeck {
     /** 
      * Execution starts here. 
      * @param args command-line arguments. 
      */ 
    public static void main(String[] args) { 
        Deck deck = new Deck(); 
        System.out.println(deck); 
        deck.shuffle();
        System.out.println(deck);
        deck.sort();
        System.out.println(deck);
    } 


}