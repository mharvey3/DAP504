import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Match extends WholeMatch {

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    private Player player1;
    private Player player2;

    public ArrayList<Player> playersLeftInMatch;

    private ArrayList<Player> playersInMatch;

    public ArrayList<Player[]> getConvertPlayerListToArray() {
        return convertPlayerListToArray;
    }

    public void setConvertPlayerListToArray(ArrayList<Player> convertPlayerListToArray) {
        ArrayList<Player[]> players = new ArrayList<>();
        int i = 0;
        for (Player player : convertPlayerListToArray){
            if (i == 0){
                setPlayer1(player);
                //Player player1 = player;
                i++;
            } else if (i == 1){
                setPlayer2(player);
                //Player player2 = player;
                i++;
            }
            if (i == 2){
                Player[] playerPair = {getPlayer1(),getPlayer2()};
                players.add(playerPair);
                //this.convertPlayerListToArray.add(playerPair);
                i = 0;
            }

        }
        this.convertPlayerListToArray = players;

    }


    private ArrayList<Player[]> convertPlayerListToArray;



    public ArrayList<Player> getNewPlayerList() {
        return newPlayerList;
    }

    private ArrayList<Player> newPlayerList;

    public Match(int playCount){
        super(playCount);

        //        int numOfRounds =  super.calcRounds();
    }

    public ArrayList<Player> getPlayersInMatch() {
        return playersInMatch;
    }

    public void setPlayersInMatch(int numOfPlayers) {
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i != numOfPlayers; i++){
            Player player = super.getPlayersInWholeMatch().get(i);

            players.add(player);
        }

        this.playersInMatch = players;

    }


    public void runMatch(){
        for (int i = 0; i > this.numberOfRounds; i++){

        }
    }

    public void runMatch(JTextArea TxtArea, boolean isSelect){
        setConvertPlayerListToArray(this.getPlayersInMatch());
        //setPlayersLeftInMatch(this.getPlayersInMatch().size());

        this.playersLeftInMatch = this.getPlayersInMatch();


        for (int i = 0; i != this.numberOfRounds; i++){
            //Start a new roound
            Round round = new Round(this.playersLeftInMatch, TxtArea, isSelect);

            this.playersLeftInMatch = round.runRound(this.getConvertPlayerListToArray());
            TxtArea.append("The winners of Round " + (i + 1) + " are: \n");
            for (Player player : this.playersLeftInMatch){
                TxtArea.append(player.firstName + " " + player.lastName + "\n");
            }
            TxtArea.append("\n");

//            Thread thread = new Thread();
//            try{
//                thread.sleep(100);
//            } catch (InterruptedException exception){
//                exception.getMessage();
//            }

            setConvertPlayerListToArray(this.playersLeftInMatch);

            if (this.playersLeftInMatch.size() == 1){

                TxtArea.append(this.playersLeftInMatch.get(0).firstName + " " + this.playersLeftInMatch.get(0).lastName + " Has won the Tournament!");
                //System.out.println(this.playersLeftInMatch.get(0).firstName + " " + this.playersLeftInMatch.get(0).lastName + " Has won the Tournament!");
                break;
            }

        }

    }

}
