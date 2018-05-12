package rockPaperScissors;

public class Game {
    private IRound round;
    private Integer numRounds;

    public Game(IRound round, Integer numRounds) {
        this.round = round;
        this.numRounds = numRounds;
    }

    public void run() {
        Integer currentRoundNum = 0;

        while (currentRoundNum < this.numRounds) {
            this.round.outcome();
            currentRoundNum++;
        }
    }
}
