public class Player {
    public int id;
    public String firstName;
    public String lastName;
    public int playerNum;

    private int roundsWon;
    private int roundsPlayed;

    public Player(int id, String firstName, String lastName, int playerNum) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerNum = playerNum;
    }

    public int getRoundsWon() {
        return roundsWon;
    }

    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public int randomNum(){
        return  1;
    }
}
