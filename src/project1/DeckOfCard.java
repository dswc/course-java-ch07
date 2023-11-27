package project1;

import java.security.SecureRandom;

public class DeckOfCard {
    String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    Card[] deck;
    SecureRandom randomNumbers = new SecureRandom();
    int count = 0;

    public DeckOfCard() {
        deck = new Card[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            int j = randomNumbers.nextInt(52);
            Card tempCard = deck[i];
            deck[i] = deck[j];
            deck[j] = tempCard;
        }

        /*
         * for (int i = 0; i < 52; i++) { System.out.println( deck[i].toString()); }
         */
    }

    public Card dealCard() {
        if (count >= 52)
            return null;

        Card myCard = deck[count];
        count++;
        return myCard;
    }
}
