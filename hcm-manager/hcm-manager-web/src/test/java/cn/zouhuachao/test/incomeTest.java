package cn.zouhuachao.test;

import java.math.BigDecimal;

import org.junit.Test;

public class incomeTest {
	@Test
	public void voift1() {
	BigDecimal add = new BigDecimal("4500").subtract(new BigDecimal("1500")).multiply(new BigDecimal("0.10")).subtract(new BigDecimal("105")).add(new BigDecimal("45"));
	BigDecimal add1 = new BigDecimal("80000").subtract(new BigDecimal(55000)).multiply(new BigDecimal("0.35")).subtract(new BigDecimal(5505)).add(new BigDecimal(9325));
	//add = add.setScale(2);
	System.out.println(add);
	System.out.println(add1);
	}
}
