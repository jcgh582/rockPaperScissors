package rockPaperScissors;

import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.MockitoAnnotations.initMocks;

import static org.testng.Assert.assertEquals;

public class HumanTest {

    @Mock
    IIOStream iostream;

    @Mock
    IMove move;

    Human human;

    @Before
    public void setUp() {
        initMocks(this);

        human = new Human(iostream);
    }

    @Test
    public void shouldReturnStringYouWhenNameIsCalled() {
        assertEquals("You", human.name());
    }
}