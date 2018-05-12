package rockPaperScissors;

public class TieRound implements IRoundOutcome {
    private IPlayer player1;
    private IPlayer player2;
    private IMove move1;
    private IMove move2;

    public TieRound(IPlayer player1, IMove move1, IPlayer player2, IMove move2) {
        this.player1 = player1;
        this.player2 = player2;
        this.move1 = move1;
        this.move2 = move2;
    }

    @Override
    public String asString() {
        return String.format(
                "Tie! %s played %s and %s played %s\n",
                this.player1.name(),
                this.move1,
                this.player2.name(),
                this.move2
        );
    }
}
