import ru.tensor.course.*;

public class App {
    public static void main(String[] args) throws Exception {
        Card card = new Card(Suit.SPADES, Rank.JACK);
        Card half_null_card = new Card(null, Rank.FIVE);
        System.out.println(card.toString());
        System.out.println(card.isStandard());
        System.out.println(half_null_card.isStandard());
        System.out.println(card.compare(new Card(Suit.HEARTS,Rank.JACK)));
        System.out.println(card.isStronger(new Card(Suit.SPADES,Rank.ACE)));
        try{
            System.out.println(card.compare(new Card(null,Rank.JACK)));
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
