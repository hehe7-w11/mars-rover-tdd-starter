public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String commands) {
        for (char cmd : commands.toCharArray()) {
            switch (cmd) {
                case 'M':
                    moveForward();
                    break;
                case 'B':
                    moveBackward();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid command: " + cmd);
            }
        }
    }

    private void moveForward() {
        switch (direction) {
            case N:
                y++;
                break;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case N:
                y--;
                break;
        }
    }

    public String report() {
        return String.format("(%d, %d) %s", x, y, direction);
    }
}