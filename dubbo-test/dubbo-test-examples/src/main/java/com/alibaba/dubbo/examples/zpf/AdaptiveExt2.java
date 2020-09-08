package com.alibaba.dubbo.examples.zpf;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * <pre>
 *
 * <pre>
 *
 * @author pengfei.zheng
 * create by 2020/9/6 9:31 AM
 */
@SPI("dubbo")
public interface AdaptiveExt2 {

	@Adaptive
	String echo(String msg, URL url);
}
