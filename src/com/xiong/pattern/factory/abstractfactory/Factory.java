package com.xiong.pattern.factory.abstractfactory;

import com.xiong.pattern.factory.abstractfactory.Pizza;

/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月17日 下午9:01:04
 * 类说明   定义一个工厂的接口
 */
public interface Factory {

	public Pizza createPizza(String type);
}
