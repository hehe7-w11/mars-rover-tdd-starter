import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    void test_moveForward() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("M");
        assertEquals("(0, 1) N", rover.report());
    }

    @Test
    void test_MoveBackward() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("B");
        assertEquals("(0, -1) N", rover.report());
    }

    @Test
    void testTurnLeft() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("L");
        assertEquals("(0, 0) W", rover.report());
    }

    @Test
    void testTurnRight() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("R");
        assertEquals("(0, 0) E", rover.report());
    }
}
