package com.ruicai.javaSE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class SetDemo {
	public static void main(String[] args) {
		//��������set1
		Set set1  = new HashSet();
		//���ö���set1
		set1.add("����Զ");
		set1.add("123");
		set1.add("����Զ");
		//����.size    ��ӡ���Ƿ��صļ��ϴ�С
		//set   �����ظ��������ͬ���ݵ�ʱ��java�Զ�����
		System.out.println("���ϴ�СΪ��"+set1.size());
		//��ӡ������
		System.out.println(set1);
		List<String> listDemo2 = new ArrayList<String>();
		listDemo2.add("��");
		listDemo2.add("��");
		/**
		 * �����е�Ԫ���ڱ�����ʱ�����¸�ֵ���ܸı�ԭ����ֵ
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
