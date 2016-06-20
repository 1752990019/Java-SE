package com.ruicai.javaSE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class SetDemo {
	public static void main(String[] args) {
		//创建对象set1
		Set set1  = new HashSet();
		//调用对象set1
		set1.add("邓哲远");
		set1.add("123");
		set1.add("邓哲远");
		//对象.size    打印的是返回的集合大小
		//set   不可重复，添加相同数据的时候，java自动处理
		System.out.println("集合大小为："+set1.size());
		//打印出集合
		System.out.println(set1);
		List<String> listDemo2 = new ArrayList<String>();
		listDemo2.add("雷");
		listDemo2.add("波");
		/**
		 * 集合中的元素在遍历的时候重新赋值不能改变原来的值
		 */
		Iterator<String> it = listDemo2.iterator();
		while(it.hasNext()){
//			Object ob=it.next();
		String ob = it.next();
			it.remove();			
			System.out.println(ob);
		}
	
	}

}
