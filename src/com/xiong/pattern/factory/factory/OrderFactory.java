package com.xiong.pattern.factory.factory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月17日 下午8:40:48
 * 类说明
 */
public abstract class OrderFactory {
	
	public static String getType(String type) {
		return type;
	}
	
	public abstract Pizza createPizza(String type);
	
	public OrderFactory(String type) {
		Pizza pizza = null;
		type = getType(type);
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

}
