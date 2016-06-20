package com.ruicai.javaSE;

import java.io.File;
import java.io.IOException;

public class JavaTest {
	public static void main(String[] args) {
		//separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
		File file = new File("F:"+File.separator+"FileTest.txt");
		//exists() 测试此抽象路径名表示的文件或目录是否存在。
		if(file.exists()){
			//delete() 删除此抽象路径名表示的文件或目录。
			file.delete();
		}else{
			try{
				System.out.println("创建文件"+file.createNewFile()+file.getName());
				System.out.println("返回绝对路径"+file.getAbsolutePath());
				System.out.println("判断是否是标准文件"+file.isFile());
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
