import java.util.Scanner;

public class RectMain {

	public static void main(String[] args) 
	{
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter side lengths of rectangle: ");
		
		double side1 = in.nextDouble();
		in.nextLine();
		double side2 = in.nextDouble();
		in.nextLine();
		
		double perimeter = (side1*2) + (side2*2);
		double area = (side1*side2);

	}

}
