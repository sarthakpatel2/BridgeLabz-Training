import java.util.*;
public class CardDistributionGame{
    //creates a complete deck using given suits and ranks
    static String[] createDeck(String[] suitList, String[] rankList) {
        String[] deck =new String[suitList.length * rankList.length];
        int pos =0;
        for (int i =0;i < suitList.length;i++) {
            for (int j= 0; j <rankList.length;j++) {
                deck[pos++] =rankList[j] +" of "+suitList[i];
            }
        }
        return deck;
    }
    //shuffles the deck using random swapping
    static void mixDeck(String[] deck) {
        for (int i = 0;i< deck.length;i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    //distributes cards equally among players
    static String[][] dealCards(String[] deck, int totalCards, int playersCount) {
        if (totalCards % playersCount != 0) {
            System.out.println("Equal distribution is not possible.");
            return null;
        }
        int cardsEach =totalCards/playersCount;
        String[][] players = new String[playersCount][cardsEach];
        int index=0;
        for (int i= 0;i<playersCount;i++) {
            for (int j=0;j< cardsEach;j++) {
                players[i][j]=deck[index++];
            }
        }
        return players;
    }
    //displays cards received by each player
    static void displayPlayers(String[][] players) {
        if (players==null)return;
        for (int i= 0;i< players.length;i++) {
            System.out.println("Player " +(i+1) +":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = createDeck(suits, ranks);
        mixDeck(deck);
        System.out.print("Enter number of cards to distribute ");
        int totalCards = sc.nextInt();
        System.out.print("Enter number of players ");
        int players = sc.nextInt();
        if (totalCards > deck.length) {
            System.out.println("Insufficient cards in the deck");
        } else {
            String[] selectedCards = new String[totalCards];
            System.arraycopy(deck, 0, selectedCards, 0, totalCards);
            String[][] result = dealCards(selectedCards, totalCards, players);
            displayPlayers(result);
        }
    }
}
