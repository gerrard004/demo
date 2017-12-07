package com.test;

public class Parent {
	private String name ;
	{
		System.out.println("父类代码块1");
	}
	Parent(){
		System.out.println("父类构造方法");
	}
	public Parent(String name) {
		System.out.println("父类带餐构造方法");
		this.name = name;
	}
	
	static{
		System.out.println("父类静态方法");
	}
	{
		System.out.println("父类代码块2");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
