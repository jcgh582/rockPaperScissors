package rockPaperScissors;

public class WinRound implements IRoundOutcome {
    private IPlayer winner;
    private IPlayer loser;
    private IMove winningMove;
    private IMove losingMove;

    public WinRound(IPlayer winner, IMove winningMove, IPlayer loser, IMove losingMove) {
        this.winner = winner;
        this.loser = loser;
        this.winningMove = winningMove;
        this.losingMove = losingMove;
    }

    @Override
    public String asString() {
        return String.format(
                "%s is the winner! %s played %s and %s played %s\n",
                this.winner.name(),
                this.winner.name(),
                this.winningMove,
                this.loser.name(),
                this.losingMove
        );
    }
}
