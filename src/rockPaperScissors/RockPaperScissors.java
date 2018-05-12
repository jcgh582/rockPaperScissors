package rockPaperScissors;

public class RockPaperScissors {
    private Integer NUM_ROUNDS = 3;

    public static void main(String[] args) {
        new RockPaperScissors().run();
    }

    public void run() {
        IIOStream consoleIOStream = ConsoleFactory.createConsole();

        new Game(
                new PrintRound(
                        new Round(
                                ComputerFactory.createComputer(),
                                new Human(consoleIOStream)
                        ),
                        consoleIOStream
                ),
                NUM_ROUNDS
        ).run();
    }
}
