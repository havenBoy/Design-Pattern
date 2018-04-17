package com.xiong.pattern.factory.factory;
/**
 * @author 作者:XiaoXiong
 * @version 创建时间：2018年4月17日 下午8:46:23
 * 类说明
 */
public class ChineseOrderFactory extends OrderFactory{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ChineseOrderFactory(String type) {
		super(type);
		this.type = type;
	}

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("chinese")) {
			return new ChinesePizza();
		}
		return null;
	}

}
