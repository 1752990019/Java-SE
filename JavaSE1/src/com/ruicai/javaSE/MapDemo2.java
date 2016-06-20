package com.ruicai.javaSE;
/**
 * 把数组放在之前的Map的结构中
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		//建立容器
		Map<String,Integer> MapValues =new HashMap<String, Integer>();
		//保存数据
		MapValues.put("语文", 100);
		MapValues.put("英语", 90);
		MapValues.put("数学", 80);
		MapValues.put("政治", 60);
		MapValues.put("地理", 40);
		System.out.println("查看Map有多少数据"+MapValues);
			//查看所有数据
			Set<Map.Entry<String,Integer>> scoresSet=MapValues.entrySet();
			Iterator<Map.Entry<String,Integer>> itSet=scoresSet.iterator();
			//遍历
			while(itSet.hasNext()){
				Map.Entry<String,Integer> ob =itSet.next();
				System.out.println(ob);
		}
			//建立容器
			Map<String,Integer> MapValues2 =new HashMap<String, Integer>();
			//保存数据
			//从指定映射中将所有映射关系复制到此映射中
			MapValues2.put("java",30);
			MapValues2.put("C++",30);
			MapValues2.put("C",30);
			System.out.println(MapValues2);
			
	}

}
