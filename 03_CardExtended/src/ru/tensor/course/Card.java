package ru.tensor.course;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank){
        if(suit == Suit.JOCKERS || rank == Rank.JOCKER){
            this.suit = Suit.JOCKERS;
            this.rank = Rank.JOCKER;
        } else{ 
            this.suit = suit;
            this.rank = rank;
        }
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " Of " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card) {
            Card card = (Card) obj;
            return this.rank == card.rank &&
                   this.suit == card.suit;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return rank.ordinal() * (suit.ordinal() + 1);
    }
    
    public boolean isStandard(){
        return suit != null && 
               rank != null;
    }

    public boolean isStronger(Card other){
        return this.suit == other.suit &&
               this.rank.ordinal() > other.rank.ordinal(); 
    }

    public int compare(Card other) throws Exception{
        if(!this.isStandard() || !other.isStandard()) 
            throw new Exception("The card needs to be standard to compare");
        if(this.equals(other)){
            return 0;
        } else if(this.suit.ordinal() > other.suit.ordinal() &&
                  this.rank.ordinal() > other.rank.ordinal() ){
                      return 1;
        } else{
            return -1;
        }
    }

    public static int compare(Card lhs, Card rhs) throws Exception{
        return lhs.compare(rhs);
    }
}
