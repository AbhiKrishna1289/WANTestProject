

import java.util.Scanner;

public class Volume {
	//Finding volume of Sphere
	public static double sphere(double r)
	{
		double PI=3.14;
		
		
		return((4/3)*PI*r*r*r);

	}
	//Finding volume of Cube
	public double cube()
	{
		return 0;

	}
	//Finding volume of Regular Tetrahedron
	public double regularTetrahedron()
	{
		return 0;

	}
	public static void main()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of sphere : ");
		double r=s.nextDouble();
		System.out.println("Volume of Sphere : "+sphere(r));
	}
}
