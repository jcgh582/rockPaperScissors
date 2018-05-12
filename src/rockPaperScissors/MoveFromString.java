package rockPaperScissors;

public class MoveFromString implements IMove {
    private String value;
    private IMoves moves;

    public MoveFromString(String value) {
        this.value = value;
        this.moves = MovesFactory.createMoves();
//        this.moves = new Moves();
    }

    @Override
    public Integer code() {
        Integer code;
        switch (this.value.charAt(0)) {
            case 'r':
            case 'R':
                code = 0;
                break;
            case 'p':
            case 'P':
                code = 1;
                break;
            case 's':
            case 'S':
                code = 2;
                break;
            default:
                code = 0;
                break;
        }
        return code;
    }

    @Override
    public int compareTo(IMove move) {
        return this.moves.move(this.code()).compareTo(move);
    }

    public String toString() {
        return this.moves.move(this.code()).toString();
    }
}
