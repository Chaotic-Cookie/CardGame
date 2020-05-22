package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    public void fillDeck() {
        for(int a = 0; a < Card.CardSuit.getSuitLength(); a++) {
            for (int b = 0; b < Card.CardValue.getLengthOfValue(); b++) {
                Card card = new Card(Card.CardSuit.getTheSuit(a), Card.CardValue.getValuesOfEnum(b));
                cards.add(card);
            }
        }
    }

    public void removeCard(int index) {
        cards.remove(index);
    }

    public void resetDeck(Deck deck) {//Used for end of rounds
        // when needed to gather all the cards back to the Main to reveal
        //cards to players and dealer.
        int sizeOfDeck = this.cards.size();

        for (int a = 0; a < sizeOfDeck; a++) {
        deck.cards.add(this.cards.get(a));
    }
        for (int a = 0; a < sizeOfDeck; a++) {
        this.removeCard(0);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public void getNewCardFromDeck(Deck deck) {
        cards.add(deck.cards.get(0));
        deck.removeCard(0);
    }

    public int getSizeOfDeck() {
        return cards.size();
    }

    public int getTVofHand() { //Obtains the total value of the current hand
        int value = 0;
        int aces = 0;

        for (Card card : cards) {
            switch (card.getCardValue()) {
                case ACE:
                    aces++;
                    break;
                case TWO:
                    value += 2;
                    break;
                case THREE:
                    value += 3;
                case FOUR:
                    value += 4;
                    break;
                case FIVE:
                    value += 5;
                    break;
                case SIX:
                    value += 6;
                    break;
                case SEVEN:
                    value += 7;
                    break;
                case EIGHT:
                    value += 8;
                    break;
                case NINE:
                    value += 9;
                    break;
                case TEN:
                    value += 10;
                    break;
                case JACK:
                    value += 10;
                    break;
                case QUEEN:
                    value += 10;
                    break;
                case KING:
                    value += 10;
                    break;
            }

        }
        return value;
    }

    @Override
    public String toString() {
        String deck = "";
        for (Card card : cards) {
            deck += card.toString() + "/n";
        }

        return deck;
    }
}
