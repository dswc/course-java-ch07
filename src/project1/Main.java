package project1;

public class Main {
    public static void main(String[] args) {
        DeckOfCard myDeckOfCard = new DeckOfCard();

        myDeckOfCard.shuffle();

        for (int i = 0; i < 53; i++) {
            Card myCard = myDeckOfCard.dealCard();
            if (myCard == null)
                System.out.println("no card");
            else
                System.out.println(i + 1 + " " + myCard.toString());
        }
    }
}
