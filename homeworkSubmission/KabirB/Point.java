public class Point {
    private int x;
    private int y;
    public Point(int startX, int startY)
    {
        x = startX;
        y = startY;
    }
    public void translate(int dx, int dy)
    {
        x=x+dx;
        y=y+dy;
    }
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
