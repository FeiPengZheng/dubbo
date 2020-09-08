package com.alibaba.dubbo.examples.zpf;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * <pre>
 *
 * <pre>
 *
 * @author pengfei.zheng
 * create by 2020/9/6 9:45 AM
 */

public class Test {


	/**
	 * @Adaptive注解优先级
	 *
	 * 1. 在类上加上@Adaptive注解的类，是最为明确的创建对应类型Adaptive类。所以他优先级最高。
	 * 2. @SPI注解中的value是默认值，如果通过URL获取不到关于取哪个类作为Adaptive类的话，就使用这个默认值，当然如果URL中可以获取到，就用URL中的。
	 * 3. 可以再方法上增加@Adaptive注解，注解中的value与链接中的参数的key一致，链接中的key对应的value就是spi中的name,获取相应的实现类。
	 */

	@org.junit.Test
	public void t1() {
		ExtensionLoader<AdaptiveExt2> extensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
		AdaptiveExt2 adaptiveExtension = extensionLoader.getAdaptiveExtension();
		URL url = URL.valueOf("test://localhost/test");
		System.out.println(adaptiveExtension.echo("d", url));
	}


	@org.junit.Test
	public void t2() {
		ExtensionLoader<AdaptiveExt2> extensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
		AdaptiveExt2 adaptiveExtension = extensionLoader.getAdaptiveExtension();
		URL url = URL.valueOf("test://localhost/test?adaptive.ext2=cloud");
		System.out.println(adaptiveExtension.echo("d", url));
	}


	@org.junit.Test
	public void t3() {
		ExtensionLoader<AdaptiveExt2> extensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
		AdaptiveExt2 adaptiveExtension = extensionLoader.getAdaptiveExtension();
		URL url = URL.valueOf("test://localhost/test");
		System.out.println(adaptiveExtension.echo("d", url));
	}
}
