package rockPaperScissors;

import java.util.Random;

public class Computer implements IPlayer {
    private IMoves moves;
    private Random random;

    public Computer(IMoves moves, Random random) {
        this.moves = moves;
        this.random = random;
    }

    @Override
    public IMove move() {
        return this.moves.move(random.nextInt(3));
    }

    @Override
    public String name() {
        return "Computer";
    }
}
