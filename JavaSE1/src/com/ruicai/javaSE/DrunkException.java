package com.ruicai.javaSE;

//��DrunkExceptionֱ�Ӽ̳������쳣�ļ��ࣨ���ࣩException
public class DrunkException extends Exception{
	//�ֶ����һ���޲ι�����
	public DrunkException(){
		
	}

	//Ϊ�Զ����쳣���һ������һ���ַ��������Ĺ�����
	public DrunkException(String message){
		super(message);
	}
}
