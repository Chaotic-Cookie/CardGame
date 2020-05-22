package com.company;

public class Card {
    public enum CardValue {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

        public static CardValue getValuesOfEnum(int index) {
            CardValue[] values = CardValue.values();
            return values[index];
        }

        public static int getLengthOfValue() {
            return CardValue.values().length;
        }
    }

    public enum CardSuit {
        HEART, DIAMOND, CLUB, SPADE;

        public static CardSuit getTheSuit(int index) {
            CardSuit[] suits = CardSuit.values();
            return suits[index];
        }

        public static int getSuitLength() {
            return CardSuit.values().length;
        }
    }
    private CardSuit suit;
    private CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public CardSuit getCardSuit() {
        return this.suit;
    }

    public CardValue getCardValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return (this.suit + " " + this.value);
    }
}


