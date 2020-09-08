package com.alibaba.dubbo.examples.zpf_base;

/**
 * <pre>
 *
 * <pre>
 *
 * @author pengfei.zheng
 * create by 2020/9/7 10:51 PM
 */

public class CodeBlockDemo {

	{
		System.out.println("初始化代码");
	}

	CodeBlockDemo() {
		System.out.println("构造器");
	}

	static {
		System.out.println("静态代码块");
	}


	public static void main(String[] args) {
		{
			int a = 10;
			System.out.println("局部代码块");
		}
		new CodeBlockDemo();

		System.out.println("==============1111");

		new CodeBlockDemo();

		System.out.println("==============2222s");
		new CodeBlockDemo();


	}


}
