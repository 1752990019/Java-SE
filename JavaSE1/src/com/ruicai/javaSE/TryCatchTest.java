package com.ruicai.javaSE;

public class TryCatchTest {
	public static void main(String[] args) {
		// ��main���������һ��
		TryCatchTest tct = new TryCatchTest();
		// ��result��������һ��tct.test�ķ���ֵ
		int result = tct.test();
		System.out.println("test()������ִ����ϣ�����ֵΪ��" + result);
		// ��result2��������һ��tct.test2�ķ���ֵ
		int result2 = tct.test2();
		System.out.println("������������㣡test2����ִ�����/����~");
		int result3 = tct.test3();
		System.out.println("������������㣡test3����ִ�����/����~����ֵΪ��" + result3);
	}

	/**
	 * divider(����)�� result(���)�� try-catch����whileѭ��
	 * ÿѭ��һ�Σ�divider��һ��result=result+100/divider ��������쳣����ӡ������׳��쳣�ˣ�������������-1
	 * ���򣺷���result
	 * 
	 * @return
	 */
	public int test() {
		// ������������
		int divider = 10;
		int result = 100;
		// ��try-catch��Χһ��whileѭ��
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			// û���쳣���result
			return result;
			// catch ����һ���������ò�����ĳ���쳣��Ķ���
		} catch (Exception e) {
			// ��ӡ���쳣�ľ�����Ϣ
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣��!!!");
			// ����-1��Ϊ���ķ���ֵ
			return -1;
		}
		// Ϊ�˷�ֹ������д��result
		// result= 0;

	}

	/**
	 * divider(����)�� result(���)�� try-catch����whileѭ��
	 * ÿѭ��һ�Σ�divider��һ��result=result+100/divider
	 * ��������쳣����ӡ������׳��쳣�ˣ�������������result=999; ���򣺷���result
	 * finally:��ӡ���������finally!!!��������������ͬʱ�����ӡ��� result��ֵ
	 * 
	 * @return
	 */
	public int test2() {
		// ������������
		int divider = 10;
		int result = 100;
		// ��try-catch��Χһ��whileѭ��
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			// û���쳣���result
			return result;
			// catch ����һ���������ò�����ĳ���쳣��Ķ���
		} catch (Exception e) {
			// ��ӡ���쳣�ľ�����Ϣ
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣��!!!");
			// ����-1��Ϊ���ķ���ֵ
			return result = 999;
		} finally {
			System.out.println("����finally����������������");
			System.out.println("����result�����ҵ�ֵ�ǣ�" + result);
		}

	}

	/**
	 * divider(����)�� result(���)�� try-catch����whileѭ��
	 * ÿѭ��һ�Σ�divider��һ��result=result+100/divider ��������쳣����ӡ������׳��쳣�ˣ���������
	 * ���򣺷���result finally:��ӡ���������finally!!!��������������ͬʱ�����ӡ��� result��ֵ
	 * ��󣬷���1111��Ϊ���
	 * 
	 * @return
	 */
	public int test3() {
		// ������������
		int divider = 10;
		int result = 100;
		// ��try-catch��Χһ��whileѭ��
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			// catch ����һ���������ò�����ĳ���쳣��Ķ���
		} catch (Exception e) {
			// ��ӡ���쳣�ľ�����Ϣ
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣��!!!");
		} finally {
			System.out.println("����finally����������������");
			System.out.println("����result�����ҵ�ֵ�ǣ�" + result);
		}
		System.out.println("����test3�����������ˣ�������");
		return 1111;
	}

}
