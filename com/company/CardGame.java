package com.company;

import java.util.List;
import java.util.Scanner;

/*
Student: Mairam Khatib
Spring 2020
Lab 4: Deck of cards

This program will play a game of 21/black jack
*/
public class CardGame {

    public static Scanner note = new Scanner(System.in);
    private static List Card;
    Deck Joker = new Deck();

        public static void main(String[] args) {
            int menu = 0;

            while (menu != 3) {
                System.out.println();
                System.out.println("1. How to play");
                System.out.println("2. Lets Play.");
                System.out.println("3. Quit");
                System.out.println("What would you like to do: ");
                String response = note.nextLine();
                menu = Integer.parseInt(response);

                switch (menu) {
                    case 1: //instuctions
                        instuctions();
                        break;

                    case 2: //adds one more card
                            Game();
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

    public String Game(){ //the game itself
        int menu2 = 0;
        int dealer = 0;
        int player = Joker.getTVofHand();
        String prompt = "";
        Scanner box = new Scanner(System.in);
        
        
        System.out.println("1. Deal Round.");
        System.out.println("2. Hit me.");
        System.out.println("3. Stay.");
        System.out.println("4. Bust.");
        System.out.println("5. Quit.");
        System.out.println();
        String response = note.nextLine();
        menu2 = Integer.parseInt(response);

        while(!prompt.equalsIgnoreCase("n")) {
            switch (menu2) {
                case 1: //will give the players their cards
                    Joker.getNewCardFromDeck(Joker);
                    Joker.getNewCardFromDeck(Joker);
                    break;

                case 2: //gives an extra card

                    Joker.getNewCardFromDeck(Joker);

                    break;
                case 3: //youre happy with the cards
                    System.out.println("");
                    compare(dealer, player);
                    break;

                case 4://you got over 21
                    compare(dealer, player);
                    break;

                case 5:
                    System.out.println("Dealer wins automatically by forfeit.");
                    System.exit(0);
                    break;
            }

        }
        return prompt;
    }
            //the dealers hand is dealt
            public static int dealerHand(){
                int dealer = 0;


                return dealer;
            }//end of the dealers hand

            //compares the two hands to see who wins

    public static void compare(int dealer, int player){
            if(dealer > player){//dealers hand is closer to 21
                System.out.println("Dealer wins!You have over 21.");
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
            System.out.println("The dealer then turns over their other card and needs to decide what to do.");
            System.out.println("If the dealer has 16 or under then they must take another card.");
            System.out.println("If the dealer has 21 (Ace and a ten value card) the dealer wins.");
            System.out.println("If the dealer goes bust then everyone else wins.");
            System.out.println("We reshuffle the deck of cards after every game.");

        }//end instructions
}//end class
