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
        t20MatchPlayer = new Player(new T20MatchStyle(),"Rahul Sharma",89.89d,7000);
        testMatchPlayer = new Player(new TestMatchStyle(),"Cheteshwar Pujara",27.89d,2000);
        oneDayMatchPlayer = new Player(new OneDayMatchStyle(),"Mahendra Singh Dhoni",90.000d,13000);
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
        oneDayMatchPlayer.setPlayingStrategy(new T20MatchStyle());
        assertEquals(oneDayMatchPlayer.play(),"Playing offensively");
    }


}