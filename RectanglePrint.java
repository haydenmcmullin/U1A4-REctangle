// Hayden McMullin
//AP Computer Sciences
// 09/08/16
// U1A4 rectangles
//Academic Integrity Statement: 
// I have not copied, plagiarized or allowed another student to complete this exercise.  I attest that this is my own work //and reflects my understanding of the material.
/* Project Description: project creates three rectangles, than using those existing rectangles it 
 * creates 2 rectangles as intersection, using rectangles 1 and 2, than 1 and 3.
 */
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class RectanglePrint {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(5, 10, 20, 30);
		Rectangle rectangle2 = new Rectangle(10, 25, 35, 15);
		Rectangle rectangle3 = new Rectangle(20, 30, 10, 25);

		System.out.print("Rectangle 1: Coordinates (" + rectangle1.getX() + "," + rectangle1.getY() + ") ");
		System.out.print("Width= " + rectangle1.getWidth());
		System.out.println(" Height= " + rectangle1.getHeight());

		System.out.print("Rectangle 2: Coordinates (" + rectangle2.getX() + "," + rectangle2.getY() + ") ");
		System.out.print("Width= " + rectangle2.getWidth());
		System.out.println(" Height= " + rectangle2.getHeight());

		System.out.print("Rectangle 3: Coordinates (" + rectangle3.getX() + "," + rectangle3.getY() + ") ");
		System.out.print("Width= " + rectangle3.getWidth());
		System.out.println(" Height= " + rectangle3.getHeight());

		Rectangle rectangle4 = new Rectangle();
		Rectangle2D.intersect(rectangle1, rectangle2, rectangle4);
		
		System.out.print("Rectangle 4: Coordinates (" + rectangle4.getX() + "," + rectangle4.getY() + ") ");
		System.out.print("Width= " + rectangle4.getWidth());
		System.out.println(" Height= " + rectangle4.getHeight());

		Rectangle rectangle5 = new Rectangle();
		Rectangle2D.intersect(rectangle1, rectangle3, rectangle5);

		System.out.print("Rectangle 5: Coordinates (" + rectangle5.getX() + "," + rectangle5.getY() + ") ");
		System.out.print("Width= " + rectangle5.getWidth());
		System.out.println(" Height= " + rectangle5.getHeight());
	}
}

/*
Rectangle 1: Coordinates (5.0,10.0) Width= 20.0 Height= 30.0
Rectangle 2: Coordinates (10.0,25.0) Width= 35.0 Height= 15.0
Rectangle 3: Coordinates (20.0,30.0) Width= 10.0 Height= 25.0
Rectangle 4: Coordinates (10.0,25.0) Width= 15.0 Height= 15.0
Rectangle 5: Coordinates (20.0,30.0) Width= 5.0 Height= 10.0

 */