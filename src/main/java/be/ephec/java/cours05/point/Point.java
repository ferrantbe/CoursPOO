package be.ephec.java.cours05.point;

public class Point {

    private int x, y;

    public Point(int x, int y) throws ConstructorException {
        if (x < 0 || y < 0) throw new ConstructorException("Message");
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) throws MoveException {
        if ((x + dx < 0) || (y + dy < 0)) throw new MoveException();
        this.x += dx;
        this.y += dy;
    }


}
