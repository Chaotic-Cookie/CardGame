import java.lang.reflect.Array;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/*
Student: Mairam Khatib
Spring 2020
Lab 4: Deck of cards

This program will play a game of 21/black jack
*/

public class Card_Game{
    

    public static void main(String[] args) {
    int menu = 0;

    while (menu != 3) {
        System.out.println("1. How to play");
        System.out.println("2. Lets Play.");
        System.out.println("3. Quit");
        String response = book.nextLine();
        menu = Integer.parseInt(response);

        switch (menu) {
            case 1: //instuctions
                instuctions();
                break;

            case 2: //adds one more card

                break;

            case 3: //im done, thanks
                System.exit(0);
                break;

            default: //man you should have read the options :c
                System.out.println("This is an invalid option, please try again.");
                break;
                }//end switch case
            }//end while loop
        }//end main

    // will deal the original 2 cards
    public dealHand(){
        //randomizer needed to deal the cards fairly

    }//end dealing hand

    //the dealers hand is dealt
    public dealerHand(){

    }//end of the dealers hand 

    //compares the two hands to see who wins
    public compare(int value){

        if(dealer > player){//dealers hand is closer to 21
            System.out.println("Dealer wins!");
        }else if(dealer == player){ //the numbers are equal
            System.out.println("A tie!");

        }else{ //the players is closer to 21
            System.out.println("Player wins!");
        }
            
    }//end compare
    private static void instuctions() {
        //instructions on how to play the game
        System.out.println("Aim of the 21 Card Game is to get 21 or as close to as possible.");
        System.out.println("Number cards have their face value, jacks, kings and queens are worth 10");
        System.out.println("Ace can be either 1 or 11 and the player who holds the ace gets to choose the value of the card.");
        System.out.println("The dealer and all other players have two cards.");
        System.out.println("With the exception of the dealer the players have their cards face up. ");
        System.out.println("The dealer has one card up and one card face down.");
        System.out.println("The dealer goes to each player one at a time.");
        System.out.println("The player needs to decide if they want another card (hit) or will sit on what they have.");
        System.out.println("You can have as many cards as you like as long as you don’t go over 21.");
        System.out.println("Players are not competing against each other, but against the dealer.");
        System.out.println("The dealer then turns over their other card and needs to decide what to do. If the dealer has 16 or under then they must take another card.");
        System.out.println("If the dealer has 21 (Ace and a ten value card) the dealer wins.");
        System.out.println("If the dealer goes bust then everyone else wins.");
        System.out.println("We reshuffle the deck of cards after every game.");
        System.out.println();
    }//end instructions

}//end class
