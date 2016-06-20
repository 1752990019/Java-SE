package com.ruicai.javaSE;

public class man1 {

	public static void main(String[] args) {
		// 创建 hai 对象
		Man hai = new Man();
//		// 调用 hai 对象，并赋值
//		hai.name = "瑞才";
		//set得到
		hai.setName("瑞才");
		//get打印
		hai.getName(); 
		 //分别打印出姓名，年龄，性别的值
		System.out.println(hai.getName());
		// 使用hai对象调用man方法
		hai.man();
		
		
		 }
	}
