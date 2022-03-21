import ru.tensor.course.*;

public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = Deck.create(false);
       
        Card card1 = deck.getCard();
        Card card2 = deck.getCard();
        Card card3 = deck.getCard();

        deck.returnCard(card1);
        deck.returnCard(card3);
        try{
            deck.returnCard(card3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println(deck);

        deck.shuffle();
        System.out.println("Shuffled:\n");
        System.out.println(deck);
        
        deck.sort();
        System.out.println("Sorted:\n");
        System.out.println(deck);

        while(!deck.isEmpty()){
            deck.getCard();
        }
        System.out.println();
        System.out.println(deck);

    }
}
