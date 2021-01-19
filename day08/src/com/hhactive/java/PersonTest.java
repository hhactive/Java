package com.hhactive.java;

/*
 * 属性=成员变量=Field 
 * 行为=Method 
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="TOM";
		p1.isMale=true;
		
		
		//调用方法 
		p1.eat();
		
		
		Person p2=new Person();
		
	}
	
	

}

class Person{
	String name;
	int age=1;
	boolean isMale;
	
	public void eat() {
		System.out.println("要吃饭");
	}
	
	public void sleep() {
		System.out.println("要睡觉");
	}
	
	public void talk() {
		System.out.println("要说话");
	}
	
	
	
	
	
}
