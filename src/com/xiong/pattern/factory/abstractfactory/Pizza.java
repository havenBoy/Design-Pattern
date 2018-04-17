package com.xiong.pattern.factory.abstractfactory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月16日 下午8:51:01
 * 类说明
 */
public abstract class Pizza {
	
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void prepare();

	public void bake() {
		System.out.println(name + " bake...");
	}
	
	public void cut() {
		System.out.println(name + " cut...");
	}
	
	public void box() {
		System.out.println(name + " box...");
	}

}
