package by.htp.les07.main;

import by.htp.les07.entity.Test1;
import by.htp.les07.logic.Logic;
import by.htp.les07.view.View;

public class Main {

	public static void main(String[] args) {

		Test1 test = new Test1();
		Logic logic = new Logic();
		View view = new View();

		test.setA(10);
		test.setB(20);

		view.print(test);
		view.print(logic.sum(test));
		view.print(logic.max(test));

		test.setA(75);
		test.setB(14);

		view.print(test);
		view.print(logic.sum(test));
		view.print(logic.max(test));
	}
}
