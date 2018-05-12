package rockPaperScissors;

import java.util.Random;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.AssertJUnit.assertEquals;

import org.junit.Test;
import org.junit.Before;

import org.mockito.Mock;

public class ComputerTest {

    @Mock
    Random random;

    @Mock
    Moves moves;

    @Mock
    Move move;

    private Computer computer;

    @Before
    public void setUp() {
        initMocks(this);
        when(random.nextInt(3)).thenReturn(1);
        when(moves.move(1)).thenReturn(move);

        computer = new Computer(moves, random);
    }

    @Test
    public void shouldReturnStringComputerWhenNameIsCalled() {
        assertEquals("Computer", computer.name());
    }

    @Test
    public void shouldReturnMoveWhenMoveIsCalled() {
        assertEquals(move, computer.move());
    }
}
