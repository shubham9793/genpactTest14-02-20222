package com.org.gen.day6;


class Rectangle {
	
   private double length;
   private double width;
   
   
   public Rectangle() {
      length = 0;
      width = 0;
   }

   
   public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }

   public double getArea() {
      return length * width;
   }
}




class Box extends Rectangle {
   private double height;

   public Box() {
      super();
      height = 0;
   }


   public Box(double length, double width, double height) {
		super(length, width);
		// TODO Auto-generated constructor stub
		this.height = height;
	}

public double getVolume()
   {
      return getArea() * height;
   }
}





public class TestAssignment__1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
 
      Box b = new Box();

     
      System.out.println("Default Box area: " + b.getVolume());

   
      Box b1 = new Box(10.5, 5.5, 3.5);

      System.out.println("parameterized Box Area: " + b1.getVolume());
   }
}