package com.hhavtive.test;

public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr=new int[] {54,897,32,15,97,12};
		//冒泡排序
		//每次外层循环找到一个最大的放到最后（j的最后）
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}
			}
		}
		
		
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
			
		}
	}

}
