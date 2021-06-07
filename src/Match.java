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

    public void setPlayersInMatch(int numOfPlayers) {
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i != numOfPlayers; i++){
            Player player = super.getPlayersInWholeMatch().get(i);
            System.out.println(player.id + ": " + player.firstName + " " + player.lastName);
            //inMatch.
            players.add(player);
        }

        this.playersInMatch = players;


        //for (Player player : super.getPlayersInWholeMatch()){

        //}
        //this.playersInMatch = super.getPlayersInWholeMatch();
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
