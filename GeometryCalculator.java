import java.util.Scanner;

/*
  Program for Geometry Calculator.
  Author: Rohit Agrawal
  E-mail Address: ra2381@email.vccs.edu
  Programming Assignment HW8.
  Last Changed: March 3, 2018.
 */
@SuppressWarnings("resource")
public class GeometryCalculator 
{
	public static void main (String[] args)
	{
		
		System.out.println("1. Calculate the Area of a Circle\n" +
				"2. Calculate the Area of a Rectangle\n" +
				"3. Calculate the Area of a Triangle\n" +
				"4. Quit.");
		
		int number;
		System.out.println("Enter your choice (1-4):");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		
	
		
		switch (number)
		{
			case 1:
				final double pi = 3.14159;
				double radius;
				System.out.println("What is the radius of a circle?");
				radius = keyboard.nextDouble();
				
				if (radius> 0)
				{
					double areaCircle = pi * (radius * radius);
					System.out.println("The area of circle is " + areaCircle);
				}
				else
				{
					System.out.println("Radius cannot be negative");
				}
				break;
			case 2:
				double length, width;
				System.out.println("What is the length and width of the rectangle?");
				length = keyboard.nextDouble();
				width = keyboard.nextDouble();
				
				double areaRectangle = length * width;
				
				if (length <= 0 || width<= 0)
				{
					System.out.println("Lenth or Width cannot be negative");
				}
				else 
				{
					System.out.println("The area of rectangle is " + areaRectangle);
				}
				break;
			case 3:
				double base, height;
				System.out.println("What is the base and height of the triangle?");
				base = keyboard.nextDouble();
				height = keyboard.nextDouble();
				
				double areaTriangle = base * height * 0.5;
				
				if (base <= 0 || height <= 0)
				{
					System.out.println("Base or height cannot be negative");
				}
				else
				{
					System.out.println("The area of triangle is " + areaTriangle);
				}
				break;
			case 4:
				{
				System.exit(0);
				}
				break;
			default:
				{
				System.out.println("Invalid number!");
				}
			
		}
	}
}	


// Tried with if else statement!!
		/*if (number==1)
		{
			final double pi = 3.14159;
			double radius;
			System.out.println("What is the radius of a circle?");
			radius = keyboard.nextDouble();
			
			if (radius< 0)
			{
				System.out.println("Radius cannot be negative");
			}
			else
			{
				double areaCircle = pi * (radius * radius);
				System.out.println("The area of circle is " + areaCircle);
			}
			System.exit(0);
		}
		if (number ==2)
		{
			double length, width;
			System.out.println("What is the length and width of the rectangle?");
			length = keyboard.nextDouble();
			width = keyboard.nextDouble();
			
			double areaRectangle = length * width;
			
			if (length <= 0 || width<= 0)
			{
				System.out.println("Lenth or Width cannot be negative");
			}
			else 
			{
				System.out.println("The area of rectangle is " + areaRectangle);
			}
			System.exit(0);
		}
		if (number == 3)
		{
			double base, height;
			System.out.println("What is the base and height of the triangle?");
			base = keyboard.nextDouble();
			height = keyboard.nextDouble();
			
			double areaTriangle = base * height * 0.5;
			
			if (base <= 0 || height <= 0)
			{
				System.out.println("Base or height cannot be negative");
			}
			else
			{
				System.out.println("The area of triangle is " + areaTriangle);
			}
			System.exit(0);
		}
		if (number == 4)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid number!");
		}
		*/