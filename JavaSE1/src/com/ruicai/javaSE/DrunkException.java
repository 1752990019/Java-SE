package com.ruicai.javaSE;

//让DrunkException直接继承所有异常的集类（父类）Exception
public class DrunkException extends Exception{
	//手动添加一个无参构造器
	public DrunkException(){
		
	}

	//为自定义异常添加一个带有一个字符串参数的构造器
	public DrunkException(String message){
		super(message);
	}
}
