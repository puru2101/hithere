package com.p1.hello;

import java.lang.reflect.*;

class hai1 {
	public int x = 200;

	public hai1() {
		System.out.println("hai");
	}
}

class jtc1 extends hai1 {
	public static final int a = 10;
	public static int b = 20;

	protected jtc1(int a) {

	}

	public jtc1() {

	}

	public void show() {
		System.out.println("show");
		System.out.println(a);
		System.out.println(b);

	}

	public void m1(String s1, String s2) {
		System.out.println("m1");
		System.out.println(s1);
		System.out.println(s2);
	}

	public void m2(int x1, int x2) {
		System.out.println("m1");
		System.out.println(x1);
		System.out.println(x2);

	}
}

public class Hello2 {

	public static void main(String[] args) throws Exception {
		Class cls = Class.forName("com.p1.hello.jtc1");
		jtc1 j1 = (jtc1) cls.newInstance();
		j1.show();
		System.out.println(Modifier.PUBLIC);
		System.out.println(Modifier.FINAL);
		System.out.println(Modifier.STATIC);

		System.out.println("*****Fields*****");
		Field fs[] = cls.getFields();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getModifiers() + "..." + fs[i].getType() + "..." + fs[i].getName());
		}

		System.out.println("*****DeclaredFields*****");
		Field dfs[] = cls.getDeclaredFields();
		for (int i = 0; i < dfs.length; i++) {
			System.out.println(dfs[i].getModifiers() + "..." + dfs[i].getType() + "..." + dfs[i].getName());
		}
		System.out.println("*****methods*****");
		Method m[] = cls.getMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].getModifiers() + "..." + m[i].getReturnType() + "..." + m[i].getName());

		}
		System.out.println("*****delcraedmethods*****");
		Method dm[] = cls.getDeclaredMethods();
		for (int i = 0; i < dm.length; i++) {
			System.out.println(dm[i].getModifiers() + "..." + dm[i].getReturnType() + "..." + dm[i].getName());
		}

		System.out.println("*****Constructeers*****");
		Constructor c[] = cls.getConstructors();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getModifiers() + "..." + "..." + c[i].getName());
		}
		System.out.println("*****declredConstructeers*****");
		Constructor dc[] = cls.getDeclaredConstructors();
		for (int i = 0; i < dc.length; i++) {
			System.out.println(dc[i].getModifiers() + "..." + "..." + dc[i].getName());

		}

		System.out.println("*******invoking methods dyamically");
		Method mm[] = cls.getDeclaredMethods();
		for (int i = 0; i < mm.length; i++) {
//			if (mm[i].getName().equals("show")) {
//                mm[i].invoke(j1, null);
//			}
//			if (mm[i].getName().equals("m1")) {
//				Object o[] = { "jtc1", "jtc2" };
//				mm[i].invoke(j1, o);
//			}
			if (mm[i].getName().equals("m2")) {
				Object o[] = { 1, 2 };
				mm[i].invoke(j1, o);
			}
		}

	}

}