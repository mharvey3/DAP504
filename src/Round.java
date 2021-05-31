import java.util.ArrayList;

public class Round {

    public int roundNumber;

    public ArrayList<String> playersInRound;

    public ArrayList<Integer> winnersOfRound;


    public void addToWinner(ArrayList<Integer> winnersOfRound, Player player){

        this.winnersOfRound.add(player.playerNum);
    }


}