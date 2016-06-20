package com.ruicai.javaSE;
/**
 * Map
 * 建立容器，保存数据，移除所有数据，查看Map有多少数据，移除数据，获取指定的数据
 */
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		//建立容器
		Map<String ,Integer> MapValues = new HashMap<String,Integer>();
		//保存数据
		MapValues.put("雷波",80);      //"雷波",80     键值对
		MapValues.put("周勇",99);
		//移除所有数据
		//MapValues.clear();
		//查看Map有多少数据
		System.out.println("查看Map有多少数据"+MapValues);
		//移除数据
		//MapValues.remove("雷波"); //传递key就可以
		//MapValues.remove("周勇");    
		//获取指定的数据
		System.out.println("移除"+MapValues.remove("雷波"));
		//int score=MapValues.get("雷波");
		int score1=MapValues.get("周勇");
		//System.out.println("雷波的成绩"+score+"分");
		System.out.println("周勇的成绩"+score1+"分");
		if(MapValues.isEmpty()){
			System.out.println("Map为空"+MapValues.size());
		}
	}
	

}
