import java.util.Date;
import java.awt.*;

public class Objects {
	public static void main(String arg[]){

		Date now = new Date();
		System.out.println(now.getTime());
		// System.out.println("hello");

		Point point1 = new Point(1,2);
		Point point2 = point1;
		System.out.print(point1.x);
		System.out.println(point1.y);
		System.out.print(point2.x);
		System.out.println(point2.y);
		
		point1.y = 23;
		point1.x = 45;

		System.out.print(point1.x);
		System.out.println(point1.y);
		System.out.print(point2.x);
		System.out.println(point2.y);


	}
}