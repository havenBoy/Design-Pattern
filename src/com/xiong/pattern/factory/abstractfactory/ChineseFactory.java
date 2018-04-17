package com.xiong.pattern.factory.abstractfactory;

import com.xiong.pattern.factory.abstractfactory.Pizza;

/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月17日 下午9:02:28
 * 类说明
 */
public class ChineseFactory implements Factory{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("chinese")) {
			pizza = new ChinesePizza();
		}
		return pizza;
	}

}
