package rockPaperScissors;

import java.util.Random;

public class ComputerFactory {
    public static Computer createComputer() {
        return new Computer(MovesFactory.createMoves(), new Random());
    }
}
