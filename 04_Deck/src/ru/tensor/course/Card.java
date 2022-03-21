package ru.tensor.course;

public class Card implements Comparable<Card> {
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
        return rank.ordinal() + (suit.ordinal()) * Rank.values().length;
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
        } else if(this.hashCode() > other.hashCode() ){
                      return 1;
        } else{
            return -1;
        }
    }

    public static int compare(Card lhs, Card rhs) throws Exception{
        return lhs.compare(rhs);
    }

    @Override
    public int compareTo(Card o) {
        try {
            return this.compare(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
