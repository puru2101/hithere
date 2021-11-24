package com.p1.hello;

import java.lang.reflect.Modifier;

interface i1 {
}

interface i2 {
}

class A {
}

final class hai extends A implements i1, i2 {

	int a = 10;
	int b;

	hai() {

	}

	hai(int b) {
		this.b = b;

	}

	void show() {
		System.out.println(a);
		System.out.println(b);
	}

}

public class Hello {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls = Class.forName("com.p1.hello.hai");
		hai h1 = (hai) cls.newInstance();
		System.out.println(h1.getClass().getName());
		System.out.println(cls.getPackageName());
		System.out.println(cls.getPackage());
		System.out.println(cls.getSuperclass());
		Class c[] = cls.getInterfaces();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getName());
		}
          
		System.out.println(cls.getModifiers());//
		System.out.println(Modifier.PUBLIC);
		System.out.println(Modifier.FINAL);//
	}

}
