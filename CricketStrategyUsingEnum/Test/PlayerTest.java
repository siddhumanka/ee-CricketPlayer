import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user-2 on 7/9/16.
 */
public class PlayerTest {


    Player t20MatchPlayer = null;
    Player testMatchPlayer = null;
    Player oneDayMatchPlayer = null;

    @Before
    public void setUp() throws Exception {
        t20MatchPlayer = new Player(PlayingStrategy.T20_STYLE,"Rahul Sharma",89.89d,7000);
        testMatchPlayer = new Player(PlayingStrategy.TEST_STYLE,"Cheteshwar Pujara",27.89d,2000);
        oneDayMatchPlayer = new Player(PlayingStrategy.ONEDAY_STYLE,"Mahendra Singh Dhoni",90.000d,13000);
    }

    @Test
    public void itShouldReturnTheStyleOfT20MatchPlayer() throws Exception {
        assertEquals(t20MatchPlayer.play(),"Playing offensively");

    }

    @Test
    public void itShouldReturnTheStyleOfTestMatchPlayer() throws Exception {
        assertEquals(testMatchPlayer.play(),"Playing defensively");
    }

    @Test
    public void itShouldReturnTheStyleOfOneDayMatchPlayer() throws Exception {
        assertEquals(oneDayMatchPlayer.play(),"Playing both offensively and defensively");
    }

    @Test
    public void itShouldReturnTheStyleOfOneDayMatchPlayerAfterChangingTheStyle() throws Exception {
        oneDayMatchPlayer.setPlayingStrategy(PlayingStrategy.T20_STYLE);
        assertEquals(oneDayMatchPlayer.play(),"Playing offensively");
    }

}