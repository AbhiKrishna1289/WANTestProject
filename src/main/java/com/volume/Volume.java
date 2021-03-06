package com.volume;
import java.util.Scanner;

public class Volume {
	//Finding volume of Sphere
	public static double sphere(double r)
	{
		double PI=3.141592653589793238;
		double volume=(float)4/(float)3*PI*r*r*r;
		return(volume);

	}
	//Finding volume of Cube
	public static double cube(double l)
	{
		return (l*l*l);

	}
	//Finding volume of Regular Tetrahedron
	public static double regularTetrahedron(double a)
	{
		return((float)(Math.sqrt(2)*a*a*a)/(float)12);

	}
	public static void main(String arg[])
	{
		int option=0;
		Scanner s=new Scanner(System.in);
		do{
			System.out.println("Please select an option for find volume of: "
				+ "\n 1.Sphere "
				+ "\n 2.Cube"
				+ "\n 3.Tetrahedron"
				+ "\n 4.Exit"
				);
		option=s.nextInt();
			switch(option)
			{

			case 1:
				System.out.println("Enter the radius of sphere : \n");
				double radius=s.nextDouble();
				System.out.println("Volume of Sphere : "+String.format( "%.2f",sphere(radius)));
				break;
			case 2:
				System.out.println("Enter  width of cube : \n");
				double length=s.nextDouble();
				System.out.println("Volume of Cube : "+String.format( "%.2f",cube(length)));
				break;
			case 3:
				System.out.println("Enter the edge of tetrahedron");
				Double area=s.nextDouble();
				System.out.println("Volume of Regular Tetrahedron :"+String.format( "%.2f",regularTetrahedron(area)));
			case 4:
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}
		}while(option!=4);
	}
}
