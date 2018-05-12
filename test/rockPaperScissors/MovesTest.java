package rockPaperScissors;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MovesTest {
    private Move move0 = new Move(0, "0");
    private Move move1 = new Move(1, "1");

    private IMoves moves = new Moves(
            new IMove[] { move0, move1 });

    @Test
    public void shouldReturnMoveWithName0AndCode0() {
        int move0Code = move0.code();
        int moves0Code = moves.move(0).code();

        assertEquals(move0Code, moves0Code);
    }

    @Test
    public void shouldReturnMoveWithName1AndCode1() {
        int move1Code = move1.code();
        int moves1Code = moves.move(1).code();

        assertEquals(move1Code, moves1Code);
    }
};
