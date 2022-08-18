package oop.pt;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
    }
    
    public double distance(int newX, int newY) {
        return Math.sqrt(Math.pow(this.x-newX, 2)+Math.pow(this.y-newY, 2));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x-p.getX(), 2)+Math.pow(this.y-p.getY(), 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(3);
        p1.setY(4);
        System.out.println(p1.distance());
        System.out.println(p1.distance(6, 9));

        Point p2 = new Point();
        p2.setX(-4);
        p2.setY(-10);
        System.out.println(p1.distance(p2));
    }
}
