import java.util.Random;
public class SnakeAndLadder{
    //constants declared
    static final int NO_PLAY=0;
    static final int LADDER=1;
    static final int SNAKE=2;
    static final int WINNING_POSITION=100;
    static Random random = new Random();
    //roll dice 
    static int rollDice() {
        return random.nextInt(6)+1;
    }
    //options:- No Play/ Ladder / Snake
    static int getOption() {
        return random.nextInt(3);
    }
    //play one turn and return updated position
    static int playTurn(int position,int diceValue,int option,String player) {
        switch (option) {
            case NO_PLAY:
                System.out.println(player+" gets NO PLAY");
                break;
            case LADDER:
                System.out.println(player+" gets LADDER");
                int remaining=WINNING_POSITION-position;
                if (diceValue<=remaining){
                    position+=diceValue;
                }else{
                    System.out.println("Needs exact number, stays at "+position);
                }
                break;
            case SNAKE:
                System.out.println(player+" gets SNAKE");
                position-=diceValue;
                if (position<0) {
                    position=0;
                }
                break;
        }
        return position;
    }
    public static void main(String[] args){
        int playerAPosition=0;
        int playerBPosition=0;
        int diceCountA=0;
        int diceCountB=0;
        boolean isPlayerATurn=true;
        System.out.println("Snake and Ladder Game Started:-");
        System.out.println("Players start at position 0\n");
        //game loop
        while (playerAPosition<WINNING_POSITION &&playerBPosition< WINNING_POSITION) {
            int diceValue =rollDice();
            int option= getOption();
            //Player A turn
            if (isPlayerATurn){
                diceCountA++;
                System.out.println("Player A rolls: "+diceValue);
                playerAPosition=playTurn(playerAPosition,diceValue, option, "Player A");
                System.out.println("Player A Position: " + playerAPosition);
                //extra turn if Ladder
                if (option!=LADDER){
                    // switch turn
                    isPlayerATurn=false;
                }
            } else{
                //Player B turn
                diceCountB++;
                System.out.println("Player B rolls: "+diceValue);
                playerBPosition = playTurn(playerBPosition, diceValue,option,"Player B");
                System.out.println("Player B Position: " +playerBPosition);
                if (option!=LADDER) {
                    isPlayerATurn=true;
                }
            }
            System.out.println("");
        }
        //winner
        if (playerAPosition==WINNING_POSITION) {
            System.out.println("Player A WINS!");
        } else {
            System.out.println("Player B WINS!");
        }
        //dice count
        System.out.println("\nTotal Dice Rolls:");
        System.out.println("Player A: "+diceCountA);
        System.out.println("Player B: "+diceCountB);
    }
}
