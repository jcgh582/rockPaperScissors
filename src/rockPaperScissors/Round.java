package rockPaperScissors;

public class Round implements IRound {
    private IPlayer player1;
    private IPlayer player2;

    public Round(IPlayer player1, IPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public IRoundOutcome outcome() {
        IMove move1 = this.player1.move();
        IMove move2 = this.player2.move();

        IRoundOutcome outcome;

        switch(move1.compareTo(move2)) {
            case -1:
                outcome = new WinRound(this.player1, move1, this.player2, move2);
                break;
            case 1:
                outcome = new WinRound(this.player2, move2, this.player1, move1);
                break;
            default:
                outcome = new TieRound(this.player1, move1, this.player2, move2);
                break;
        }

        return outcome;
    }
}
