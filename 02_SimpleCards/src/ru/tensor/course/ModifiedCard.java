package ru.tensor.course;

public class ModifiedCard {

    private Suit suit;
    private Rank rank;
    private static int last_ranks[] = {-1, -1, -1, -1};

    public ModifiedCard(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
        last_ranks[suit.ordinal()] = Math.max(last_ranks[suit.ordinal()], rank.ordinal());
    }

    public ModifiedCard(Suit suit){
        int last_suit_rank = 1 + last_ranks[suit.ordinal()];
        if(last_suit_rank < Rank.values().length - 1){
            last_ranks[suit.ordinal()]++;
        } else{
            System.out.printf("Reached maximum rank for %s.", suit);
            System.out.println();
        }
        this.suit = suit;
        this.rank = Rank.values()[last_suit_rank];
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
}
