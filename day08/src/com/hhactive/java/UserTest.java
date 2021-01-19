package com.hhactive.java;

/*
 * 属性 局部变量 
 * 
 * 属性 直接定义在一{}内 
 * 局部变量 0声明在方法内、方法形参、 代码块内、构造器形参、构造器内部变量
 * 
 */
public class UserTest {

}

class User{
	//属性 
	String name; 
	int age; 
	
	public void talk(String language) {//形参（方法的小括号）
		System.out.println("我们使用"+language+"进行交流");
		
	}
	
	public void eat() {
		String food="Pizza" //局部变量
		System.out.println("北方人喜欢吃"+food);
	}
	//属性 权限修饰符 private public 缺省 
	//局部变量 
	
	//默认初始化 
	//属性 类的属性 根据类型 都有默认初始化值。 
	//属性存在堆 局部变量存在栈 
	
	
	
	
}
