package com.ruicai.javaSE; 

public class ChainTest {
	/**
	 * test1():�׳�"�ȴ���"�쳣
	 * test2():����test()1,����"�ȴ���"�쳣,���Ұ�װ������ʱ�쳣,�����׳�
	 * main������,����test(),���Բ���test()�����׳����쳣
	 * @param args
	 */
  public static void main(String[] args) {
	  ChainTest ct= new ChainTest();
	  try {
		ct.test2();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
  public void test1() throws DrunkException{
	  throw new DrunkException("�ȾƱ𿪳�");
  }
  public void test2(){
	  try {
		test1();
	} catch (DrunkException e) {
		// TODO Auto-generated catch block
//		RuntimeException newExc = new RuntimeException("˾��һ�ξ�,����������!");
//		newExc.initCause(e);
		RuntimeException newExc = new RuntimeException(e);
		newExc.initCause(e);
		throw newExc;
	}
  }
}
