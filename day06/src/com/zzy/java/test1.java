package com.zzy.java;

public class test1 {
	public static void main(String[] args) {
		int[] ids;
		ids=new int[] {1001,1002,1003,1004};
		//静态初始化
				
	    //动态初始化 初始化与赋值分开进行 
		String[] names=new String[5];
		//调用数组 角标从0开始 
		names[0]="大狗";
	    names[1]="二狗";
	    names[2]="三狗";
	    names[3]="四狗";
	    names[4]="小狗";
	    System.out.println(names.length);
	    
	    for (int i=0;i<names.length;i++) {
	    	System.out.println(names[i]);
	    }
	}

}
