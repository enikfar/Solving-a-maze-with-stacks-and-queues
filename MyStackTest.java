package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStackTest {

	@Test
	void test() {
		MyStack<Integer> mine = new MyStack<Integer>();
		mine.push(5);
		mine.push(6);
		assertEquals(6,mine.top());

	}
}
