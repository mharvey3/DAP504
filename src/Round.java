import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
//Get File in
public class Round implements HandleableText {


    public ArrayList<Player> playersInRound;

    public ArrayList<Player> winnersOfRound;

    public JTextArea txtArea;

    public Boolean isSelect;

    public Round(ArrayList<Player> players, JTextArea txtArea, Boolean isSelect){
        this.playersInRound = players;
        this.txtArea = txtArea;
        this.isSelect = isSelect;
    }


    public void addToWinner(ArrayList<Player> winnersOfRound, Player player){

        this.winnersOfRound.add(player);
    }


    public ArrayList<Player> runRound(ArrayList<Player[]> playersInRound){
        Player winner;
        ArrayList<Player> winnersOfRound = new ArrayList<>();
        for (Player[] players : playersInRound){
            for (int i = 0; i != players.length; i+=2){
                Game game = new Game(players[i], players[i+1]);
                winner = game.runGame();
                winnersOfRound.add(winner);
                if (this.isSelect){
                    showVals(txtArea, winner);
                }
            }
        }
        return winnersOfRound;
    }

    public void playersNotInRound(){

    }

    public void showVals(JTextArea txtArea, Player player){
        txtArea.append("The winner of the game was " + player.firstName + " " + player.lastName + "\n");
    }

}