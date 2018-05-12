package rockPaperScissors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameTest {
    @Mock
    IRound round;

    private Integer N = 3;

    private Game game;

    @Before
    public void setUp() {
        initMocks(this);

        game = new Game(round, N);
    }

    @Test
    public void shouldRunNRoundsWhenGameIsRan() {
        game.run();

        verify(round, times(N)).outcome();
    }
}
