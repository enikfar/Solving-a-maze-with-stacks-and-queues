package lab3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MyQueueTest {

	@Test
	void test() {
		MyQueue<Integer> mine = new MyQueue<Integer>();
		assertEquals(0,mine.size());
//		Integer x = mine.dequeue();
		assertThrows( NoSuchElementException.class  ,() ->mine.dequeue());
//		mine.enqueue(5);
//		mine.enqueue(6);
//		
//		assertEquals(2,mine.size());
//		Integer x = mine.dequeue();
		
		
		
		
//		assertEquals(5,x);
		
//		assertEquals(2,mine.size());
//		
//		assertEquals(5,mine.front());
		
		
	}
	
	
	@Disabled
	void testfront() {
		MyQueue<Integer> mine = new MyQueue<Integer>();
		assertEquals(0,mine.size());
		assertThrows( NoSuchElementException.class  ,() ->mine.front());
		mine.enqueue(5);
		mine.enqueue(6);
		assertEquals(5,mine.front());
		
		
		
		
		
		
		
	}
	
	@Disabled
	void testfront1() {
		MyQueue<Integer> mine = new MyQueue<Integer>();
		assertEquals(0,mine.size());
//		mine.enqueue(5);
		
		assertThrows( NoSuchElementException.class  ,() ->mine.front());
		
		
		
		
		
		
		
	}
	

}
