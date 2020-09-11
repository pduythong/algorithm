package test;

public class Robot {
    Move move = Move.NO_MOVE;
    Coordinate prev = new Coordinate(0, 5);
    Coordinate cur;
    public Robot() {
        cur = new Coordinate(0, 5);
    }

    Robot(int x, int y) {
        cur = new Coordinate(x, y);
    }


    void moveX(int dx) {
        move = Move.X;
        move(dx, 0);
    }

    void moveY(int dy) {
        move = Move.Y;
        move(0, dy);
    }

    public void printCurrentCoordinates() {
        System.out.println(cur);
    }

    public void printLastCoordinates() {
        System.out.println(prev);
    }


    public void printLastMove() {
        switch (move) {
            case X:
                int dx = cur.x - prev.x;
                System.out.println(move.name + " " + dx);
                break;
            case Y:
                int dy = cur.y - prev.y;
                System.out.println(move.name + " " + dy);
                break;
            default:
                throw new RuntimeException("No previous move.");
        }
    }

    private void move(int dx, int dy) {
        prev.x = cur.x;
        prev.y = cur.y;
        cur.shift(dx, dy);
    }

}


class Coordinate {
    int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void shift(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return x + " " + y;
    }
}

enum Move {
    X("x"), Y("y"), NO_MOVE("No move");
    final String name;

    Move(String name) {
        this.name = name;
    }
}
