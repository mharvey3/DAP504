import java.util.Random;
//Get File In
public class Game {
    public Player playerOne;
    public Player playerTwo;

    private int playerOneScore;

    private int playerTwoScore;


    public Game(Player firstPlayer, Player secondPlayer){
        this.playerOne = firstPlayer;
        this.playerTwo = secondPlayer;
        this.playerOneScore = 0;
        this.playerTwoScore = 0;
    }

    public Player getWinnerOfPoint(){
        Random randNum = new Random();

        int winnerNum = randNum.nextInt(2);

        if (winnerNum == 1){
            return playerOne;
        } else{
            return playerTwo;
        }

    }

    public void pointWinner(){
        Random randNum = new Random();
        int winnerNum = randNum.nextInt(2);

        if (winnerNum == 1){
            setPlayerOneScore(getPlayerOneScore() + 1);
        } else if (winnerNum == 0){
            setPlayerTwoScore(getPlayerTwoScore() + 1);
        } else{
            pointWinner();
        }
    }

    public Player runGame() {
        boolean gameRunning = false;
        System.out.println("The player named " + playerOne.firstName + " " + playerOne.lastName + " is up against " + playerTwo.firstName + " " + playerTwo.lastName + ".");
        //int winner = addWinnerANdLoser();
        Player winnerOfGame = null;
        while (!gameRunning){
            if (this.playerOneScore >= 11 || this.playerTwoScore >= 11){
                if (this.playerOneScore >= (this.playerTwoScore + 2)){
                    //Player 1 has one the Game
                    System.out.println(playerOne.firstName + " has won the game");

                    winnerOfGame = playerOne;
                    gameRunning = true;

                } else if(this.playerTwoScore >= (this.playerOneScore + 2)){
                    //Player 2 has one the game
                    System.out.println(playerTwo.firstName + " has won the game");
                    winnerOfGame = playerTwo;
                    gameRunning = true;
                } else {
                    pointWinner();
                }
            } else{
                pointWinner();
            }
        }
        playerOne.setRoundsPlayed(playerOne.getRoundsPlayed()+1);
        playerTwo.setRoundsPlayed(playerTwo.getRoundsPlayed()+1);
        winnerOfGame.setRoundsWon(winnerOfGame.getRoundsWon() + 1);

        Thread thread = new Thread();
        try{
            thread.sleep(10);
        } catch (InterruptedException exception){
            exception.getMessage();
        }
        return winnerOfGame;
    }

    public int addWinnerANdLoser(){
        int winnerPlayer = getWinnerOfPoint().id;
        return winnerPlayer;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public void setPlayerOneScore(int playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(int playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }



}
