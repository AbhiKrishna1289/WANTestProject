//Testing volume of sphere,cube,tetrahedron with different values
package com.TestVolume;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.volume.Volume;

public class TestVolume {
public Volume v=new Volume();
double expectedVolume=0;

//1.A sphere of radius 1 has volume 4.19
@Test(priority=1)
public void sphere1()
{
	expectedVolume=4.19;
	System.out.println("Volume of sphere with radius 1 : "+v.sphere(1));
	System.out.println("Volume of sphere with radius 1 upto 2 decimal points"+String.format( "%.2f",v.sphere(1)));
	Assert.assertEquals(String.format( "%.2f",v.sphere(1)),String.format( "%.2f",expectedVolume));  
}
//2.A sphere of radius 5 has volume 523.6
@Test(priority=2)
public void sphere2()
{
	expectedVolume=523.6;
	System.out.println("Volume of sphere with radius 1 : "+v.sphere(5));
	System.out.println("Volume of sphere with radius 1 upto 2 decimal points"+String.format( "%.2f",v.sphere(5)));
	Assert.assertEquals(String.format( "%.2f",v.sphere(5)),String.format( "%.2f",expectedVolume));  
}
//3. A cube of width 1 has volume 1
@Test(priority=3)
public void cube1()
{
	expectedVolume=1;
	System.out.println("Volume of cube with width 1 : "+v.cube(1));
	Assert.assertEquals(v.cube(1),expectedVolume);  
}
//4. A cube of width 5 has volume 125
@Test(priority=4)
public void cube2()
{
	expectedVolume=125;
	System.out.println("Volume of cube with width 5 : "+v.cube(5));
	Assert.assertEquals(v.cube(5),expectedVolume);  
}
//5. A regular tetrahedron with edge 1 has volume 0.12
@Test(priority=5)
public void tetrahedron1()
{
	expectedVolume=0.12;
	System.out.println("Volume of tetrahedron with edge 1 : "+v.regularTetrahedron(1));
	System.out.println("Volume of tetrahedron with edge 1 upto 2 decimal points"+String.format( "%.2f",v.regularTetrahedron(1)));
	Assert.assertEquals(String.format( "%.2f",v.regularTetrahedron(1)),String.format( "%.2f",expectedVolume));  
}
//6. A regular tetrahedron with edge 5 has volume 14.73
@Test(priority=6)
public void tetrahedron2()
{
	expectedVolume=14.73;
	System.out.println("Volume of tetrahedron with edge 5 : "+v.regularTetrahedron(5));
	System.out.println("Volume of tetrahedron with edge 5 upto 2 decimal points"+String.format( "%.2f",v.regularTetrahedron(5)));
	Assert.assertEquals(String.format( "%.2f",v.regularTetrahedron(5)),String.format( "%.2f",expectedVolume));  
}
}
