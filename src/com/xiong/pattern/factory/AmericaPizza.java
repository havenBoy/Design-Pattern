package com.xiong.pattern.factory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月16日 下午9:01:48
 * 类说明
 */
public class AmericaPizza extends Pizza{

	@Override
	public void prepare() {
		super.setName("America ");
		System.out.println(name + "prepare...");
	}

}
