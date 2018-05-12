package rockPaperScissors;

public class Moves implements IMoves {
    private IMove[] moves;

    public Moves(IMove[] moves) {
        this.moves = moves;
    }

    @Override
    public IMove move(int code) {
        return this.moves[code];
    }
}
