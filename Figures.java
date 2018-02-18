package absclass;

import java.util.Scanner;

public class Figures {
	
	public static void main(String args[])
	{

		Circle c1 = new Circle();	 
		c1.findArea();
		         c1.findPerimeter();
		         String c = c1.toString();
		         System.out.println(c);
		         System.out.println();
		         Rectangle r = new Rectangle();
		         r.findArea();
		         r.findPerimeter();
		         String b = r.toString();
		         System.out.println(b);
		         System.out.println();
		         Triangle t = new Triangle();
		         t.findArea();
		         t.findPerimeter();
		         String a = t.toString();
		         System.out.println(a);
		         

		}

		}
		abstract class Figure
		{
		abstract void findArea() ;
		abstract void findPerimeter();
		    public abstract String toString();
		}
		class Circle extends Figure
		{
		int radius;
		Scanner sc = new Scanner(System.in);
		Circle()
		{
		System.out.println( "enter the radius" );
		radius = sc.nextInt();
		}
		void findArea()
		{
		int area;
		area = (int)3.14*radius*radius; 
		System.out.println("area of circle = "+area); 
		}
		void findPerimeter()
		{
		int perimeter;
		perimeter = 2*(int)3.14*radius;
		System.out.println("perimeter of circle is "+perimeter);
		}
		public String toString()
		{
		return("circle");
		}
		}
		class Rectangle extends Figure
		{
		Scanner sc = new Scanner(System.in);
		Rectangle()
		{
		System.out.println("enter the length of rectangle");
		length = sc.nextInt();
		System.out.println("enter the breadth of rectangle");
		breadth = sc.nextInt();
		}
		int length;
		int breadth;
		void findArea()
		{
		int area;
		area = length*breadth;
		System.out.println("area of rectangle is "+area);
		}
		void findPerimeter()
		{
		int perimeter;
		perimeter = 2*(length+breadth);
		System.out.println("perimeter of rectangle is "+perimeter);
		}
		public String toString()
		{
		return("rectangle");
		}
		}
		class Triangle extends Figure
		{
		Scanner sc = new Scanner(System.in);
		Triangle()
		{
		System.out.println("enter the height of triangle");
		height = sc.nextInt();
		System.out.println("enter the base of triangle");
		base = sc.nextInt();
		System.out.println("enter the sum of other two side of triangle");
		sumOfOtherSides = sc.nextInt();
		}
		int height;
		int base;
		int sumOfOtherSides;
		void findArea()
		{
		double area;
		area = 0.5*height*base;
		System.out.println("area of triangle is "+area);
		}
		void findPerimeter()
		{
		int perimeter;
		perimeter = base + sumOfOtherSides;
		System.out.println("perimeter of triangle is "+perimeter);
		}
		public String toString()
		{
		return("triangle"); }}
		

