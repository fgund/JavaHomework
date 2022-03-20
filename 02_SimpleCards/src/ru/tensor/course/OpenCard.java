package ru.tensor.course;

// Класс с конструктором по умолчанию и двумя изменяемыми полями.
public class OpenCard {
    public Suit suit;
    public Rank rank;

    public OpenCard(){
        suit = Suit.SPADES;
        rank = Rank.ACE;
    }
}
