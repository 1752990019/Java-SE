package com.ruicai.javaSE;

public class TryCatchTest {
	public static void main(String[] args) {
		// 在main方法里调用一下
		TryCatchTest tct = new TryCatchTest();
		// 用result变量接收一下tct.test的返回值
		int result = tct.test();
		System.out.println("test()方法，执行完毕！返回值为：" + result);
		// 用result2变量接收一下tct.test2的返回值
		int result2 = tct.test2();
		System.out.println("我想大声告诉你！test2（）执行完毕/！！~");
		int result3 = tct.test3();
		System.out.println("我想大声告诉你！test3（）执行完毕/！！~返回值为：" + result3);
	}

	/**
	 * divider(除数)： result(结果)： try-catch捕获while循环
	 * 每循环一次，divider减一，result=result+100/divider 如果捕获异常，打印输出“抛出异常了！！！”，返回-1
	 * 否则：返回result
	 * 
	 * @return
	 */
	public int test() {
		// 定义两个变量
		int divider = 10;
		int result = 100;
		// 用try-catch包围一个while循环
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			// 没有异常输出result
			return result;
			// catch 块有一个参数，该参数是某种异常类的对象
		} catch (Exception e) {
			// 打印出异常的具体信息
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
			// 返回-1作为他的返回值
			return -1;
		}
		// 为了防止报错先写上result
		// result= 0;

	}

	/**
	 * divider(除数)： result(结果)： try-catch捕获while循环
	 * 每循环一次，divider减一，result=result+100/divider
	 * 如果捕获异常，打印输出“抛出异常了！！！”，返回result=999; 否则：返回result
	 * finally:打印输出“这是finally!!!哈哈哈！！”，同时打出打印输出 result的值
	 * 
	 * @return
	 */
	public int test2() {
		// 定义两个变量
		int divider = 10;
		int result = 100;
		// 用try-catch包围一个while循环
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			// 没有异常输出result
			return result;
			// catch 块有一个参数，该参数是某种异常类的对象
		} catch (Exception e) {
			// 打印出异常的具体信息
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
			// 返回-1作为他的返回值
			return result = 999;
		} finally {
			System.out.println("这是finally！！哈哈哈！！！");
			System.out.println("我是result！！我的值是！" + result);
		}

	}

	/**
	 * divider(除数)： result(结果)： try-catch捕获while循环
	 * 每循环一次，divider减一，result=result+100/divider 如果捕获异常，打印输出“抛出异常了！！！”，
	 * 否则：返回result finally:打印输出“这是finally!!!哈哈哈！！”，同时打出打印输出 result的值
	 * 最后，返回1111作为结果
	 * 
	 * @return
	 */
	public int test3() {
		// 定义两个变量
		int divider = 10;
		int result = 100;
		// 用try-catch包围一个while循环
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			// catch 块有一个参数，该参数是某种异常类的对象
		} catch (Exception e) {
			// 打印出异常的具体信息
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
		} finally {
			System.out.println("这是finally！！哈哈哈！！！");
			System.out.println("我是result！！我的值是！" + result);
		}
		System.out.println("我是test3！我运行完了！哈哈哈");
		return 1111;
	}

}
