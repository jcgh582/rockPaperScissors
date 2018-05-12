package rockPaperScissors;

import org.junit.Test;
import org.junit.Before;

import java.util.Scanner;

import java.io.PrintStream;

import static org.mockito.Mockito.*;
import static org.testng.AssertJUnit.assertEquals;

public class ConsoleTest {

    private PrintStream mockPrintStream;
    private Scanner mockScanner;
    private Console console;

    String stringToPrint = "stringToPrint";

    @Before
    public void setUp() {
        mockPrintStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintGivenString() {
        mockScanner = new Scanner("");
        console = new Console(mockPrintStream, mockScanner);

        console.print(stringToPrint);

        verify(mockPrintStream, times(1)).print(stringToPrint);
    }

    @Test
    public void shouldPrintGivenStringAndReadStringFromScanner() {
        String stringToRead = "stringToRead";
        mockScanner = new Scanner(stringToRead);
        console = new Console(mockPrintStream, mockScanner);

        String result = console.value(stringToPrint);

        verify(mockPrintStream, times(1)).print(stringToPrint);
        assertEquals(stringToRead, result);
    }
}
