package com.guigu.java.Client;

public class CustomerView {
	CustomerList custList = new CustomerList(10);
	public void enterMainMenu() {
		boolean isFlag=true;
		
		do {
			System.out.println("/n--------------客户信息管理软件-----------/n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");
			
			
			char menu=CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("确认是否退出(Y/N)：");
				char exit = CMUtility.readConfirmSelection();
				if (exit == 'Y') {
					isFlag = false;
				}
				break;
			}
			
		}while (isFlag);
	}
	
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.println("请输入姓名");
		String name=CMUtility.readString(10);
		System.out.println("请输入性别");
		char gender=CMUtility.readChar();
		System.out.println("请输入年龄");
		int age=CMUtility.readInt();
		System.out.println("请输入电话");
		String phone=CMUtility.readString(11);
		System.out.println("请输入邮箱");
		String email=CMUtility.readString(30);
		
		// 封装为一个对象
		Customer customer = new Customer(name, gender, age, phone, email);
		// 将此对象添加到CustomerList里的数组中
		boolean flag = custList.addCustomer(customer);
		if (flag) {
			System.out.println("---------------------添加完成---------------------");
			} else {
			System.out.println("人数已达上限，添加失败！");
			}
	}
	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		Customer customer;
		int index;
		for (;;) {
			System.out.print("请选择待修改客户编号(-1退出)：");
			index = CMUtility.readInt();
			if (index == -1) {
				// break;//不能使用break
				return;
			}
			// 对于用户来讲，我们让index 默认从1开始。
			customer = custList.getCustomer(index - 1);
			if (customer == null) {
				System.out.println("无法找到指定客户！");
			} else {
				break;
			}
		}
		// 修改用户的信息
		System.out.print("姓名(" + customer.getName() + "):");
		// 如果用户输入了姓名，则返回用户输入的信息，如果用户没有输入，直接回车，则返回customer.getName()
		String name = CMUtility.readString(5, customer.getName());

		System.out.print("性别(" + customer.getGender() + "):");
		char gender = CMUtility.readChar(customer.getGender());

		System.out.print("年龄(" + customer.getAge() + "):");
		int age = CMUtility.readInt(customer.getAge());

		System.out.print("电话(" + customer.getPhone() + "):");
		String phone = CMUtility.readString(13, customer.getPhone());

		System.out.print("邮箱(" + customer.getEmail() + "):");
		String email = CMUtility.readString(15, customer.getEmail());
		// 获取用户输入的属性以后，得到的最新的Customer对象
		customer = new Customer(name, gender, age, phone, email);
		// 对于用户来讲，我们让index 默认从1开始。
		boolean flag = custList.replaceCustomer(index - 1, customer);
		if (flag) {
			System.out
					.println("---------------------修改完成---------------------");
		} else {
			System.out
					.println("---------------------修改失败---------------------");
		}
	}
	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		Customer customer;
		int index;
		for (;;) {

			System.out.print("请选择待删除客户编号(-1退出)：");
			// 针对普通用户来讲：此index从 1开始
			index = CMUtility.readInt();
			if (index == -1) {
				return;
			}

			customer = custList.getCustomer(index - 1);
			if (customer == null) {
				System.out.println("无法找到指定客户！");
			} else {
				break;
			}
		}

		// 一旦找到相应的索引位置的customer以后，让用户决定是否确认删除
		System.out.print("确认是否删除(Y/N)：");
		char deleteOrNot = CMUtility.readConfirmSelection();
		if (deleteOrNot == 'Y') {
			boolean flag = custList.deleteCustomer(index - 1);
			if (flag) {
				System.out
						.println("---------------------删除完成---------------------");
			} else {
				System.out
						.println("---------------------删除失败---------------------");
			}
		} else {
			return;
		}
	}
	private void listAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------");
          // 获取所有的客户
		Customer[] customers = custList.getAllCustomers();
		if (customers.length == 0) {
			System.out.println("没有任何客户记录！");
		///above is what if no customer
		}
		else {
				System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
				for (int i = 0; i < customers.length; i++) {
					Customer cust = customers[i];
						// 方式一：
						// System.out.println((i + 1) + "\t" + cust.getName() + "\t"
						// + cust.getGender() + "\t" + cust.getAge() + "\t"
						// + cust.getPhone() + "\t\t" + cust.getEmail());
						// 方式二：
					System.out.println((i + 1) + "\t" + cust.info());

				}
		}
		System.out
				.println("-------------------------客户列表完成-------------------------");
	}
	//临时main用来建立
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}


}
