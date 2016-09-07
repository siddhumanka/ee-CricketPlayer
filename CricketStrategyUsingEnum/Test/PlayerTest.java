import org.junit.Before;
import org.junit.Test;

/**
 * Created by user-2 on 7/9/16.
 */
public class PlayerTest {


    Player t20Player = null;
    Player testPlayer = null;
    Player oneDayPlayer = null;

    @Before
    public void setUp() throws Exception {
        t20Player = new Player(PlayingStrategy.T20_STYLE,"Rahul Sharma",89.89d,7000);
        testPlayer = new Player(PlayingStrategy.TEST_STYLE,"Cheteshwar Pujara",27.89d,2000);
        oneDayPlayer = new Player(PlayingStrategy.ONEDAY_STYLE,"Mahendra Singh Dhoni",90.000d,13000);
    }

    @Test
    public void play() throws Exception {
        System.out.println(t20Player.play());
        System.out.println(testPlayer.play());
        System.out.println(oneDayPlayer.play());
        oneDayPlayer.setPlayingStrategy(PlayingStrategy.T20_STYLE);
        System.out.println(oneDayPlayer.play());
    }

}