package bridgelabzRFP;

public class Main {
	public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        Line line = new Line(point1, point2);
        System.out.println("Length of the line: " + line.getLength());
        
        Line line1 = new Line(new Point(0, 0), new Point(3, 4));  
        Line line2 = new Line(new Point(1, 1), new Point(4, 5));
        
        if (line1.equals(line2)) {
            System.out.println("The two lines are equal in length.");
        } else {
            System.out.println("The two lines are not equal in length.");
        }
	}
}
