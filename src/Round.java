import java.util.ArrayList;
//Get File in
public class Round {

    public int roundNumber;

    public ArrayList<Player[]> playersInRound;

    public ArrayList<Player> winnersOfRound;


    public void addToWinner(ArrayList<Player> winnersOfRound, Player player){

        this.winnersOfRound.add(player);
    }

    public ArrayList<Player[]> setupPlayersArray(Match match){
        for (int i = 0; i>= match.getPlayersInMatch().size(); i+=2) {
            Player player1 = match.getPlayersInMatch().get(i);
            Player player2 = match.getPlayersInMatch().get(i+1);
            Player[] players = new Player[]{player1, player2};
            this.playersInRound.add(players);
        }
        return this.playersInRound;
    }

    public void setupRound(int roundNumber, int numOfRounds, Match match){
//        if (roundNumber != 1 and ){
//
//        }
        for (int i = 0; i >= match.getPlayersInMatch().size(); i+=2){

        }
    }

    public void startRound(ArrayList<Player[]> playersInRound){
        for (Player[] players : playersInRound){
            for (int i = 0; i != players.length; i+=2){
                Game game = new Game(players[i], players[i+1]);
                game.runGame();
            }
        }
    }

}