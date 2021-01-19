package com.guigu.exer1;

public class PassObject {
	public static void main(String[] args) {
		PassObject test=new PassObject();
		
		Circle c= new Circle();
		test.printAreas(c, 5);
	}
	public void printAreas(Circle c, int time) {
		
		System.out.println("Radius\t\tArea");
		 for (int i=1;i<=time;i++) {
			 c.radius=i;
		//设置圆的半径
			 System.out.println(c.radius+"\t\t"+c.findArea());
		 } 
	}

}
