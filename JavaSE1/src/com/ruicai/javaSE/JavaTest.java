package com.ruicai.javaSE;

import java.io.File;
import java.io.IOException;

public class JavaTest {
	public static void main(String[] args) {
		//separator ��ϵͳ�йص�Ĭ�����Ʒָ�����Ϊ�˷��㣬������ʾΪһ���ַ�����
		File file = new File("F:"+File.separator+"FileTest.txt");
		//exists() ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ�
		if(file.exists()){
			//delete() ɾ���˳���·������ʾ���ļ���Ŀ¼��
			file.delete();
		}else{
			try{
				System.out.println("�����ļ�"+file.createNewFile()+file.getName());
				System.out.println("���ؾ���·��"+file.getAbsolutePath());
				System.out.println("�ж��Ƿ��Ǳ�׼�ļ�"+file.isFile());
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
