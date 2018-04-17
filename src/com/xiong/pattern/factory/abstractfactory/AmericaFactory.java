package com.xiong.pattern.factory.abstractfactory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月17日 下午9:14:16
 * 类说明 ： 定义了一个接口用于创建相关或者有依赖的关系族， 而不用指明是具体是那种类
 */
public class AmericaFactory implements Factory{
	
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AmericaFactory(String type) {
		this.type = type;
	}

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("America")) {
			pizza = new AmericaPizza();
		}
		return pizza;
	}

	
	public static void main(String[] args) {
		AmericaFactory americaFactory = new AmericaFactory("America");
	}

}
