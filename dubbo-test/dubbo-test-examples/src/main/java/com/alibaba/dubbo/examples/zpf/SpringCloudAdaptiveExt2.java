package com.alibaba.dubbo.examples.zpf;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;

/**
 * <pre>
 *
 * <pre>
 *
 * @author pengfei.zheng
 * create by 2020/9/6 9:37 AM
 */
//@Adaptive
public class SpringCloudAdaptiveExt2 implements AdaptiveExt2 {
	@Override
	public String echo(String msg, URL url) {
		return "spring cloud";
	}
}
