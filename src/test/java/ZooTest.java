import org.example.Cheetah;
import org.example.Turtle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ZooTest {
    private Turtle turtle;
    private Cheetah cheetah;

    @BeforeEach
    public void init() {
        Random randomeNumber = new Random();
        turtle = new Turtle("Harald", randomeNumber.nextInt(200) + 1, randomeNumber.nextInt(50) + 1);
        cheetah = new Cheetah("Olga", randomeNumber.nextInt(50), randomeNumber.nextInt(150));
    }

    @RepeatedTest(100)
    public void turtleSpeedIsNotNull() {
        Assertions.assertTrue(turtle.calculateSpeed() > 0);
    }

    @RepeatedTest(100)
    public void cheetahSpeedIsNotNull() {
        Assertions.assertTrue(cheetah.calculateSpeed() > 0);
    }

    @Test
    public void animalHasName() {
        Assertions.assertNotNull(turtle.getName());
    }


}
