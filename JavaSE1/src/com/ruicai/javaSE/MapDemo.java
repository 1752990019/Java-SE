package com.ruicai.javaSE;
/**
 * Map
 * �����������������ݣ��Ƴ��������ݣ��鿴Map�ж������ݣ��Ƴ����ݣ���ȡָ��������
 */
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		//��������
		Map<String ,Integer> MapValues = new HashMap<String,Integer>();
		//��������
		MapValues.put("�ײ�",80);      //"�ײ�",80     ��ֵ��
		MapValues.put("����",99);
		//�Ƴ���������
		//MapValues.clear();
		//�鿴Map�ж�������
		System.out.println("�鿴Map�ж�������"+MapValues);
		//�Ƴ�����
		//MapValues.remove("�ײ�"); //����key�Ϳ���
		//MapValues.remove("����");    
		//��ȡָ��������
		System.out.println("�Ƴ�"+MapValues.remove("�ײ�"));
		//int score=MapValues.get("�ײ�");
		int score1=MapValues.get("����");
		//System.out.println("�ײ��ĳɼ�"+score+"��");
		System.out.println("���µĳɼ�"+score1+"��");
		if(MapValues.isEmpty()){
			System.out.println("MapΪ��"+MapValues.size());
		}
	}
	

}
