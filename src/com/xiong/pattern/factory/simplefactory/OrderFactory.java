package com.xiong.pattern.factory.simplefactory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月16日 下午9:04:54
 * 类说明
 */
public class OrderFactory {
	
	public static String getType(String type) {
		return type;
	}
	
	public OrderFactory(String type) {
		Pizza pizza = null;
	    type = OrderFactory.getType(type);
		if (type.equals("chinese")) {
			pizza = new ChinesePizza();
		} else if (type.equals("America")) {
			pizza = new AmericaPizza();
		} 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	
	public static void main(String[] args) {
		//展示了一个简单工厂
		OrderFactory orderFactory = new OrderFactory("chinese");
	}

}
