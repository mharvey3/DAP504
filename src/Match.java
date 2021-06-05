import java.util.ArrayList;

public class Match extends WholeMatch {

    //public ArrayList<Integer> playerCount;

    //public int playCount;



    private ArrayList<Player> playersInMatch;

//    @Override
//    public ArrayList<Player> getPlayersInWholeMatch() {
//        return super.getPlayersInWholeMatch();
//    }

    public Match(int playCount){
        super(playCount);
        //        int numOfRounds =  super.calcRounds();
    }

    public ArrayList<Player> getPlayersInMatch() {
        return playersInMatch;
    }

    public void setPlayersInMatch() {
        this.playersInMatch = super.getPlayersInWholeMatch();
    }

    public void echoPlayersOfMatch(){

    }



//    public void CalculateRounds(){
//        int rounds = 0;
//        int numOfPlays = playCount;
//        while (numOfPlays != 0){
//            numOfPlays = numOfPlays / 2;
//            rounds ++;
//        }
//        numOfRounds = rounds;
//    }



}
