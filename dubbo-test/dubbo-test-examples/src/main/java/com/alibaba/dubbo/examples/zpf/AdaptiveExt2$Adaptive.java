package com.alibaba.dubbo.examples.zpf;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class AdaptiveExt2$Adaptive implements com.alibaba.dubbo.examples.zpf.AdaptiveExt2 {
	public java.lang.String echo(java.lang.String arg0, com.alibaba.dubbo.common.URL arg1) {
		if (arg1 == null) throw new IllegalArgumentException("url == null");
		com.alibaba.dubbo.common.URL url = arg1;
		String extName = url.getParameter("t", "dubbo");
		if (extName == null)
			throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.examples.zpf.AdaptiveExt2) name from url(" + url.toString() + ") use keys([t])");
		com.alibaba.dubbo.examples.zpf.AdaptiveExt2 extension = (com.alibaba.dubbo.examples.zpf.AdaptiveExt2) ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.examples.zpf.AdaptiveExt2.class).getExtension(extName);
		return extension.echo(arg0, arg1);
	}
}