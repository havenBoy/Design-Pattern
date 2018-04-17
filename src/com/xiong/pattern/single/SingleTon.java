package com.xiong.pattern.single;
/***
 * 单例模式的不同实现
 * 因程序需要，有时我们只需要某个类同时保留一个对象，不希望有更多对象，此时，我们则应考虑单例模式的设计。
 */
public class SingleTon {
	/***
	 * 私有构造函数，避免类外的调用
	 */
	private SingleTon () {}  
	
/** 懒汉模式，当真正需要的时候才回去创建实例，但没有考虑到多线程的问题，
 *  可以考虑在获取的方法上添加同步的关键字，但同时效率比较低
 * private static SingleTon singleTon;
	
	public static synchronized SingleTon getInstance() {
		if (singleTon == null) {
		    singleTon = new SingleTon();
		}
		return singleTon;
	}
 */
	
	
/** 饿汗模式，在类加载时创建一个对象，
 * 	private static SingleTon singleTon = new SingleTon();
	
	public static SingleTon getInstance() {
		return singleTon;
	}*/
	
	
	/**
	 * 双重的校验锁法
	 * 线程安全，并且实现了懒加载
	 */
	private volatile static SingleTon singleTon;
	
	public static SingleTon getInstance() {
		if (singleTon == null) synchronized (SingleTon.class) {
			if (singleTon == null) {
				singleTon = new SingleTon();
			}
		}
		return singleTon;
	}
	
}
