package com.ruicai.javaSE;
/**
 * ���������֮ǰ��Map�Ľṹ��
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		//��������
		Map<String,Integer> MapValues =new HashMap<String, Integer>();
		//��������
		MapValues.put("����", 100);
		MapValues.put("Ӣ��", 90);
		MapValues.put("��ѧ", 80);
		MapValues.put("����", 60);
		MapValues.put("����", 40);
		System.out.println("�鿴Map�ж�������"+MapValues);
			//�鿴��������
			Set<Map.Entry<String,Integer>> scoresSet=MapValues.entrySet();
			Iterator<Map.Entry<String,Integer>> itSet=scoresSet.iterator();
			//����
			while(itSet.hasNext()){
				Map.Entry<String,Integer> ob =itSet.next();
				System.out.println(ob);
		}
			//��������
			Map<String,Integer> MapValues2 =new HashMap<String, Integer>();
			//��������
			//��ָ��ӳ���н�����ӳ���ϵ���Ƶ���ӳ����
			MapValues2.put("java",30);
			MapValues2.put("C++",30);
			MapValues2.put("C",30);
			System.out.println(MapValues2);
			
	}

}
