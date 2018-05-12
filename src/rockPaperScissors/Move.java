package rockPaperScissors;

public class Move implements IMove {

    private Integer code;
    private String name;

    public Move(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer code() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(IMove move) {
        final int cmp;
        if (this.code == move.code()) {
            cmp = 0;
        } else if ((this.code - move.code() + 3) % 3 == 1) {
            cmp = -1;
        } else {
            cmp = 1;
        }
        return cmp;
    }

}
