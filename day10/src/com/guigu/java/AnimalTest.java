package com.guigu.java;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name="daxiang";
		a.age=1;
		a.legs=4;
		a.setLegs(-6);
		
		a.show();
		
		
	}
}

class Animal{
	String name;
	int age;
	int legs;
	
	public void setLegs(int l) {
		if (l>=0&& l%2==0) {
			legs=l;
		}else {
			legs=0;
					//抛出异常
		}
	}
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void show() {
		System.out.println("name+leg"+age+" "+legs);
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age=a;
	}
}

