package com.tnsif.volumeprg;

import java.util.Scanner;

public class Volume {
	
	double vc=0,vs=0,vcd=0;
	
	void Volume(int s)
	{
		vc=s*s*s;
		
		System.out.println(" The volume of the cube is" +vc);
		
	}
	
	void Volume(float r)
	{
		vs=(4/3)*(22/7)*r*r*r;
		
		System.out.println("The volume of the sphere is" +vs);
		
	}
	 void Volume(int l,int b,int h)
	 {
		 vcd=l*b*h;
		 System.out.println("The volume of the cuboid is" +vcd);
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int s,l,b,h;
        float r;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the side of the cube");
        s=sc.nextInt();
          
        System.out.println("Enter the radius of the sphere");
        r=sc.nextFloat();
          
        System.out.println("Enter l,b,h,of the cuboid");
        
        l=sc.newInt();
        b=sc.newInt();
        h=sc.newInt();
        Volume obj=new Volume();
        
        obj.Volume(s);
        obj.Volume(float r);
        obj.Volume(l,b,h);
        

}
}