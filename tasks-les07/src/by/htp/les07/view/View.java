package by.htp.les07.view;

import by.htp.les07.entity.Test1;

public class View {

	public void print(Test1 test) {

		System.out.println("a = " + test.getA() + " , " + "b = " + test.getB());
	}

	public void print(int x) {

		System.out.println(x);
	}
}
