package com.alibaba.dubbo.examples.zpf_base;

/**
 * <pre>
 *
 * <pre>
 *
 * @author pengfei.zheng
 * create by 2020/9/7 10:49 PM
 */

public class Demo {
	public static void main(String[] args) {
		SuperClass clz = new SubClass();
		System.out.println(((SubClass) clz).name);
	}
}
