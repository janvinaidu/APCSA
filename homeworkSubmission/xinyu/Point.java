package apclass;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }


    public static void main(String[] args) {
        Point p1 = new Point();      
        Point p2 = new Point(3, 4);   

        System.out.println("Original:");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

       
        p1.move(1, 2);
        p2.move(-1, 3);

        System.out.println(" Transformed:");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        double dist = Point.distance(p1, p2);
        System.out.println(" Distance: " + dist);
    }
}
