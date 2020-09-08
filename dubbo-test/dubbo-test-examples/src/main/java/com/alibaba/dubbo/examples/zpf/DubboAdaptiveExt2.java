package com.alibaba.dubbo.examples.zpf;

import com.alibaba.dubbo.common.URL;

/**
 * <pre>
 *
 * <pre>
 *
 * @author pengfei.zheng
 * create by 2020/9/6 9:34 AM
 */

public class DubboAdaptiveExt2 implements AdaptiveExt2 {
	@Override
	public String echo(String msg, URL url) {
		return "dubbo";
	}
}
