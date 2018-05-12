package rockPaperScissors;

/**
 * Round decorator with output stream
 */
public class PrintRound implements IRound {
    private Round round;
    private IIOStream out;

    public PrintRound(Round round, IIOStream out) {
        this.round = round;
        this.out = out;
    }

    @Override
    public IRoundOutcome outcome() {
        IRoundOutcome outcome = this.round.outcome();

        this.out.print(outcome.asString());

        return outcome;
    }
}
