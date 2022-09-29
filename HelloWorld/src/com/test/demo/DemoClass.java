package com.test.demo;

public class DemoClass {

	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) { 
		this.age = age;
	}
	
	public DemoClass() {
		
	}
	
	public DemoClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println("I Love India");
		
		DemoClass demo1 = new DemoClass();
		demo1.setName("Rupa");
		demo1.setAge(38);
		System.out.println(demo1.getName() + " " + demo1.getAge());
		
		DemoClass demo2 = new DemoClass();
		demo2.setName("Meena");
		demo2.setAge(41);
		System.out.println(demo2.getName() + " " + demo2.getAge());
		
		
	}
}



