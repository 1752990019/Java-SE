package com.ruicai.javaSE;

import java.util.ArrayList;
import java.util.List;

public class dzyDemo {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		Student stu=new Student();
		Student stu4=new Student(124,"tom");
		stuList.add(stu4);
		stu.setId(123);
		stu.setName("saiwin");
		stuList.add(stu);
		Student stu2=new Student();
		stu2.setId(234);
		stu2.setName("kevin");
		stuList.add(stu2);
		for (Student student : stuList) {
			System.out.println(student.getName()+"---"+student.getId());
		}
		//System.out.println(stu+"---"+stu2+"---"+stu4);
		
	}

}
