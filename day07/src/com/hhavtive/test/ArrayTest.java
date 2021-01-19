package com.hhavtive.test;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int [] arr1=new int[] {1,2,3,4};
		int [] arr2=new int[] {1,3,4,5,2};
		System.out.println(Arrays.equals(arr1,arr2));
		
		System.out.println(Arrays.toString(arr1));
		
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
