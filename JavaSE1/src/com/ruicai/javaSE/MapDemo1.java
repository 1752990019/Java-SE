package com.ruicai.javaSE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> MapValues =new HashMap<String,Integer>();
		//��������
		MapValues.put("�ײ�",80);
		MapValues.put("����",99);
		//�鿴��������
		Set<Map.Entry<String,Integer>> scoresSet=MapValues.entrySet();
				Iterator<Map.Entry<String,Integer>> itSet=scoresSet.iterator();
				//����
				while(itSet.hasNext()){
					Map.Entry<String,Integer> ob =itSet.next();
					System.out.println(ob);
				}
				//ʵ�ֵ�Veluesѭ��
//				Collection<Integer> MapVules=new Map<String>;
				
	}

}
