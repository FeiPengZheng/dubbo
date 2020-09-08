package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.ZpfDemoService;
import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre>
 *
 * <pre>
 *
 * @author pengfei.zheng
 * create by 2020/9/6 6:20 PM
 */

public class ZpfDemoServiceImpl implements ZpfDemoService {
	@Override
	public String sayGood(String name) {
		System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
		return "good " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
	}
}
