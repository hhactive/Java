package com.guigu.java.Client;

public class CustomerList {
	
	private Customer[] customers;
	private int total; 
	
	/**
	 * 构造器，用来初始化customers数组
	 * @param totalCustomer : 指定customers数组的最大空间
	 */
	
	
	public CustomerList(int totalCustomer) {
		///初始化遇到问题，究其原因还是类的问题
	    customers =new Customer[totalCustomer];
	}
	
	/**
	 * 添加指定的客户到数组中
	 * @param customer
	 * @return 添加是否成功
	 */
	public boolean addCustomer(Customer customer) {
		///customers怎么才能在类中 被使用 
		//null被忽略了，需要注意
		//这里出现过条件错误， length是大的那一个
		if (total<customers.length&&customer!=null) {
			customers[total]=customer;
			total++;
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 替换指定索引位置上的数组元素
	 * @param index
	 * @param cust
	 * @return
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index>=0&&index<total) {
			customers[index]=cust;
			return true;
		}else {
			return false;
		}
	}
	
	
	/**
	 * 删除指定索引位置上的元素
	 * @param index
	 * @return
	 */
	public boolean deleteCustomer(int index) {
		if(index>=0&&index<total) {
			for(int i=index;i<total-1;i++) {
				customers[i]=customers[i+1];
			}
			customers[--total]=null;
			//直接赋值为空，指针下滑。方法比较原始但直接
			return true;
		}
		return false;
		
	}
	
	/**
	 * 获取所有的customers对象构成的数组
	 * @return
	 */
	
	public Customer[] getAllCustomers() {
		//return customers; 了解为什么错误 
		Customer[] custs = new Customer[total];
		//给数组元素赋值
		for(int i = 0;i < custs.length;i++){
			custs[i] = customers[i];
		}
		return custs;
		
	}
	
	/**
	 * 返回指定索引位置上的Customer
	 * @param index
	 * @return 如果输入的index位置上的元素不存在，返回null
	 */
	
	public Customer getCustomer(int index) {
		if (index>=0 && index<total) {
			return customers[index];
		}
		return null;
	}
	
	
	/**
	 * 返回Customer对象的个数
	 * @return
	 */
	public int getTotal() {
		return total;
		//为什么return length是错误的
		
		
	}


}
