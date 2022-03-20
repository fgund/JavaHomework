import ru.tensor.course.*;

public class App {
    public static void main(String[] args) throws Exception {
        ModifiedCard card = new ModifiedCard(Suit.CLUBS, Rank.EIGHT);
        print(card);
        
        ModifiedCard card2 = new ModifiedCard(Suit.CLUBS);
        print(card2);
        
        ModifiedCard card3 = new ModifiedCard(Suit.SPADES);
        print(card3);

        ModifiedCard card4 = new ModifiedCard( Suit.DIAMONDS, Rank.QUEEN);
        print(card4);
        
        for(int i=0; i<15; i++){
            print(new ModifiedCard(Suit.HEARTS));
        }
        
    }

    static void print(ModifiedCard card){
        System.out.println(card.getRank() + " of " + card.getSuit());
    }
}
