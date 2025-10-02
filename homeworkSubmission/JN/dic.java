
package performanceTaskThing;

public class Example {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 8);
        System.out.println(p1);
        System.out.println(p2);

        p1.move(3, 4);
        p2.move(-1, -2);
        System.out.println(p1);
        System.out.println(p2);

        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        double d = Math.sqrt(dx * dx + dy * dy);
        System.out.println(d);

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int r1 = d1.roll();
        int r2 = d2.roll();
        int sum = r1 + r2;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(sum);


package performanceTaskThing;

public class Dice {
    private int sides;
    private int faceValue;

    public Dice() {
        sides = 6;
        faceValue = 1;
    }

    public int roll() {
        faceValue = (int)(Math.random() * sides) + 1;
        return faceValue;
    }

    public int getfaceValue() {
        return faceValue;
    }
}





package performanceTaskThing;

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 6;
        y = 3;
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int a, int b) {
        x = x + a;
        y = y + b;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
    }
}
