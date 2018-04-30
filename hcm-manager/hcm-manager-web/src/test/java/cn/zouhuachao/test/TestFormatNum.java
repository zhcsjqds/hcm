package cn.zouhuachao.test;

import org.junit.Test;

public class TestFormatNum {

	/**
	 * System.out.println(String.format("%02d",x)); //x是你要输出的整数
	 * 这样1就输出01，前面自动补0, 11还是输出11不变。
	 * 这里使用了String.format（）方法，作用就是格式化输出参数. “%02d”是指定输出格式，%作先导标记， 0表示自动补0,
	 * 2的意思是最小长度为2（如果用4，则1输出0001），d表示整数
	 */
	@Test
	public void tset() {
		System.out.println(String.format("%02d", 9));
	}
}
