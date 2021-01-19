package com.guigu.java;

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util=new ArrayUtil();
		int[] arr=new int[] {32,34,32,5,3,54,654};
		int max=util.getMax(arr);
		System.out.println("最大值为："+max);
	}

}
