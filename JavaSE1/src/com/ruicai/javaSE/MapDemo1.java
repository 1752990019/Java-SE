package com.ruicai.javaSE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> MapValues =new HashMap<String,Integer>();
		//保存数据
		MapValues.put("雷波",80);
		MapValues.put("周勇",99);
		//查看所有数据
		Set<Map.Entry<String,Integer>> scoresSet=MapValues.entrySet();
				Iterator<Map.Entry<String,Integer>> itSet=scoresSet.iterator();
				//遍历
				while(itSet.hasNext()){
					Map.Entry<String,Integer> ob =itSet.next();
					System.out.println(ob);
				}
				//实现的Velues循环
//				Collection<Integer> MapVules=new Map<String>;
				
	}

}
