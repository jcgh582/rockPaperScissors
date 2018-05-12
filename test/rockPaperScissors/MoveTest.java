package rockPaperScissors;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MoveTest {
    Move ROCK = new Move(0, "Rock");
    Move PAPER = new Move(1, "Paper");
    Move SCISSORS = new Move(2, "Scissors");

    @Test
    public void shouldReturnMoveCode() {
        int moveCode = ROCK.code();

        assertEquals(0, moveCode);
    }

    @Test
    public void shouldReturnMoveName() {
        String moveName = ROCK.toString();

        assertEquals("Rock", moveName);
    }

    @Test
    public void shouldReturnZeroForEqualMoves() {
        assertEquals(0, ROCK.compareTo(ROCK));
        assertEquals(0, PAPER.compareTo(PAPER));
        assertEquals(0, SCISSORS.compareTo(SCISSORS));
    }

    @Test
    public void shouldReturnOne() {
        assertEquals(1, ROCK.compareTo(PAPER));
        assertEquals(1, PAPER.compareTo(SCISSORS));
        assertEquals(1, SCISSORS.compareTo(ROCK));
    }

    @Test
    public void shouldReturnMinusOne() {
        assertEquals(-1, PAPER.compareTo(ROCK));
        assertEquals(-1, ROCK.compareTo(SCISSORS));
        assertEquals(-1, SCISSORS.compareTo(PAPER));
    }
}
