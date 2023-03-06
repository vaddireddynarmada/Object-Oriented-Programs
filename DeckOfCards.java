import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] deck = new String[55];
    String[][] playCards = new String[4][9];
    Random random = new Random();

    public void initializeCards() {
        int deckCount = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[deckCount] = rank[j] + " " + suit[i];
                deckCount++;
            }
        }
    }

    public void shuffleCards() {
        for (int i = 0; i < deck.length; i++) {
            int j = random.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public void printCard() {
        int deckIndex = 0;
        for (int i = 0; i < playCards.length; i++) {
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < playCards[i].length; j++) {
                playCards[i][j] = deck[deckIndex];
                System.out.println("Card : " + playCards[i][j]);
                deckIndex++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        DeckOfCards player = new DeckOfCards();
        player.initializeCards();
        player.shuffleCards();
        player.printCard();
    }
}

