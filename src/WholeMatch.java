import java.util.ArrayList;
//Get File In

public abstract class WholeMatch {
    //Whole match includes the whole JSON file, it retrieves all the players regardless of the player count.
    //Match shall use this to determine whether all of them are needed.
    //i.e will override the the actual players/count of players.
    public int numberOfPlayers;
    public int numberOfRounds;


    public WholeMatch(int numberOfPlayers){//, int numberOfRounds, ArrayList<Player> playersInWholeMatch, ArrayList<Integer> playersScores){
        this.numberOfPlayers = numberOfPlayers;
//        this.numberOfRounds = numberOfRounds;
//        this.playersInWholeMatch = playersInWholeMatch;
//        this.playersScores = playersScores;
    }

    public ArrayList<Player> getPlayersInWholeMatch() {
        return playersInWholeMatch;
    }

    public void setPlayersInWholeMatch(ArrayList<Player> playersInWholeMatch) {
        this.playersInWholeMatch = playersInWholeMatch;
    }

    public int getNumberOfPlayersInWholeMatch() {
        return numberOfPlayers;
    }

    private ArrayList<Player> playersInWholeMatch;
    private ArrayList<Integer> playersScores;

//    public ArrayList<String> playersInMatch(){
//        ArrayList<String> util = new Utilities();//.getPlayersFromJson();
//        return util;
//    }

    public int calcRounds(){
        int rounds = 0;
        int noOfPlayers = this.numberOfPlayers;

        while (noOfPlayers != 1){
            noOfPlayers = noOfPlayers / 2;
            rounds ++;
        }
        this.numberOfRounds = rounds;
        return rounds;

    }




}
