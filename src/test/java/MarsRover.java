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
                case 'L':
                    direction = direction.turnLeft();
                    break;
                case 'R':
                    direction = direction.turnRight();
                    break;
                case 'B':
                    moveBackward();
                    break;
                default:
                    // 可在拓展目标中处理无效命令，此处简单抛出异常
                    throw new IllegalArgumentException("Invalid command: " + cmd);
            }
        }
    }

    private void moveForward() {
        switch (direction) {
            case N:
                y++;
                break;
            case E:
                x++;
                break;
            case S:
                y--;
                break;
            case W:
                x--;
                break;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case N:
                y--;
                break;
            case E:
                x--;
                break;
            case S:
                y++;
                break;
            case W:
                x++;
                break;
        }
    }

    public String report() {
        return String.format("(%d, %d) %s", x, y, direction);
    }
}