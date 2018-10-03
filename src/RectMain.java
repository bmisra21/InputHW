import java.util.Scanner;

public class RectMain {


	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter side lengths of rectangle: ");
		double side1 = scan.nextDouble();
		double side2 = scan.nextDouble();
		
		
		double perimeter = (side1*2) + (side2*2);
		double area = (side1*side2);
		double diagonal = Math.sqrt((side1 * side1) + (side2 * side2));
		
		System.out.printf("Rectangle perimeter: %.2f /t Rectangle area: %.2f /t Rectangle diagonal: %.2f ", perimeter, area, diagonal );

	}

}
