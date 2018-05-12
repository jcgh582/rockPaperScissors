package rockPaperScissors;

import java.io.PrintStream;
import java.util.Scanner;

public class Console implements IIOStream {
    private Scanner input;
    private PrintStream output;

    public Console(PrintStream output, Scanner input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public void print(String string) {
        output.print(string);
    }

    @Override
    public String value(String string) {
        this.print(string);
        return input.next();
    }
}
