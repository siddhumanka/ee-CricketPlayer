import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user-2 on 7/9/16.
 */
public class PlayerTest {


    Player t20Player = null;
    Player testPlayer = null;
    Player oneDayPlayer = null;
    @Before
    public void setUp() throws Exception {
        t20Player = new Player(new OffensiveStrategy());
        testPlayer = new Player(new DefensiveStrategy());
        oneDayPlayer = new Player(new OffensiveDefensiveStrategy());
    }

    @Test
    public void play() throws Exception {
        System.out.println(t20Player.play());
        System.out.println(testPlayer.play());
        System.out.println(oneDayPlayer.play());
        t20Player.setStrategy(new OffensiveDefensiveStrategy());
        System.out.println(t20Player.play());
    }

}