package com.ruicai.javaSE;


/**
 * �ֱ𴴽�man,man1����Class��
 * ����man������½�hai����
 * @author lenovo
 *
 */
public class Man {
	//��̬���͵õ�����
	String name;
	double age;
	char sex;
	public void setName(String name){
		this.name=name;
	}
	public  String getName(){
		return name;
	}
	//����һ����̬����
	public  static void man(){
		System.out.println("�һ�˵��");
	}

}
