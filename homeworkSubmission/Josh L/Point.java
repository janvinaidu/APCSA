public class Point{
    public static void main(String[] args) {
        int p1 = new Point();      
        int p2 = new Point(3, 4);     

        System.out.println("Initial Points:");
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);


        p1.move(1, 2);  
        p2.move(6, 8); 



        System.out.println("After Moving:");
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Distance: " + distance);
    }
}//This is the first problem of the homework.

