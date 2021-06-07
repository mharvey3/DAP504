import java.util.Random;

public class Game {
    public Player playerOne;
    public Player playerTwo;


    public Game(Player firstPlayer, Player secondPlayer){
        playerOne = firstPlayer;
        playerTwo = secondPlayer;
    }

    public Player getWinnerOfGame(){
        Random randNum = new Random();

        int winnerNum = randNum.nextInt(2);

        if (winnerNum == 1){
            return playerOne;
        } else{
            return playerTwo;
        }

    }

    public void runGame(){
        System.out.println("The player named " + playerOne.firstName + playerOne.lastName + " is up against " + playerTwo.firstName+ playerTwo.lastName + ".");
        int winner = addWinnerANdLoser();
        playerOne.setRoundsPlayed(playerOne.getRoundsPlayed()+1);
        playerTwo.setRoundsPlayed(playerTwo.getRoundsPlayed()+1);
        if (playerOne.id == winner){

        }

    }

    public int addWinnerANdLoser(){
        int winnerPlayer = getWinnerOfGame().id;
        return winnerPlayer;
    }



}
