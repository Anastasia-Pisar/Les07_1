package by.htp.les07.logic;

import by.htp.les07.entity.Test1;

public class Logic {

	public int sum(Test1 test) {
		return (test.getA() + test.getB());
	}

	public int max(Test1 test) {

		if (test.getA() > test.getB()) {
			return test.getA();
		} else {
			return test.getB();
		}
	}
}
