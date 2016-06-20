package com.ruicai.javaSE;


/**
 * 分别创建man,man1两个Class，
 * 采用man类调用新建hai对象
 * @author lenovo
 *
 */
public class Man {
	//静态类型得到属性
	String name;
	double age;
	char sex;
	public void setName(String name){
		this.name=name;
	}
	public  String getName(){
		return name;
	}
	//创建一个动态方法
	public  static void man(){
		System.out.println("我会说话");
	}

}
