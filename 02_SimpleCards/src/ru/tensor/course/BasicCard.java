package ru.tensor.course;

/**
 * Класс с установкой начальных значений в конструкторе,
 * закрытыми полями и методами чтения значений.
 */
public class BasicCard {
    private Suit suit;
    private Rank rank;

    public BasicCard(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
}
