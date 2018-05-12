package rockPaperScissors;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleFactory {
    public static IIOStream createConsole() {
        return new Console(new PrintStream(System.out), new Scanner(System.in));
    }
}
