package ru.tensor.course;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    private static final int NUM_JOCKERS = 2;

    private Deck(boolean with_jockers){
        cards = new ArrayList<Card>();
        for(Suit suit: Suit.values()){
            if(suit == Suit.JOCKERS ) continue;
            
            for(Rank rank: Rank.values()){
                if(rank == Rank.JOCKER) continue;

                cards.add(new Card(suit, rank));
            }
        }
        
        if(with_jockers){
            for(int i = 0; i < NUM_JOCKERS; i++)
                cards.add(new Card(Suit.JOCKERS, Rank.JOCKER));
        }

    }
    
    public static Deck create(boolean with_jockers){
        return new Deck(with_jockers);
    }

    public static Card getRandomCard(){
        return new Card(Suit.values()[(int) (Math.random() * Suit.values().length)],
                        Rank.values()[(int) (Math.random() * Rank.values().length)]);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void sort(){
        Collections.sort(cards);
    }

    public Card getCard() throws Exception{
        if(isEmpty()) throw new Exception("Deck is empty!");
        
        int index = cards.size() - 1;
        return cards.remove(index);
    }

    public void returnCard(Card card) throws Exception{
        if(!canReturn(card)) throw new Exception("The deck already contains this card!");

        cards.add(card);
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        if(isEmpty()) return "Deck is empty!";
        
        String result = new String();
        for(Card card: cards){
            result += card.toString() + "\n";
        }
        return result;
    }

    private boolean canReturn(Card card){
        int index = cards.indexOf(card);
        if(index < 0) return true;

        if(card.getRank() == Rank.JOCKER &&
           index == cards.lastIndexOf(card)){
            return true;
        }

        return false;
    }
}
