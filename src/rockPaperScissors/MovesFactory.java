package rockPaperScissors;

public class MovesFactory {
    public static IMoves createMoves() {
        IMove ROCK = new Move(0, "Rock");
        IMove PAPER = new Move(1, "Paper");
        IMove SCISSORS = new Move(2, "Scissors");

        return new Moves(new IMove[] {ROCK, PAPER, SCISSORS});
    }
}
