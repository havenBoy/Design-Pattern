package com.xiong.pattern.factory.factory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月17日 下午8:46:23
 * 类说明
 */
public class AmericaOrderFactory extends OrderFactory{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AmericaOrderFactory(String type) {
		super(type);
		this.type = type;
	}

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("America")) {
			return new AmericaPizza();
		}
		return null;
	}
	/***
	 * 定义了创建对象的抽象方法，由子类来决定具体要实例化的类
	 * 工厂模式把对象的实例化推迟到子类中的实现
	 */
	public static void main(String[] args) {
		AmericaOrderFactory americaOrderFactory = new AmericaOrderFactory("America");
	}

}
