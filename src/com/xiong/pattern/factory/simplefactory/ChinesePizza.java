package com.xiong.pattern.factory.simplefactory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月16日 下午8:57:21
 * 类说明
 */
public class ChinesePizza extends Pizza{

	@Override
	public void prepare() {
		super.setName("chinese ");
		System.out.println(name + "prepare");
	}

}
