package com.algs4.fun;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInfo;
import java.util.NoSuchElementException;
import java.util.*;


public class QueueTest
{

	private Queue<Integer> queue=new Queue<Integer>();
    private int expected;
	@Test
	//the '@Test' annotation marks 
	//each test will be run independently 
	
	public void testIsEmptyOnEmpty() {
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testIsEmptyOnNotEmpty() {
		queue.enqueue(5);
		assertTrue(!queue.isEmpty());
	}
	
	@Test
	public void testOneEnqueue() {
		queue.enqueue(5);
	}
	
	@Test
	public void testOneDequeue() {
		queue.enqueue(5);
		assertTrue(5==queue.dequeue());
	}
	
	@Test
	public void testOrdering() {
		expected=1;
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(expected,(int)queue.dequeue()); //got error assert is ambiguous so I added (int) for casting
		assertEquals(2,(int)queue.dequeue());
		assertEquals(3,(int)queue.dequeue());
	}
	
	
	
	@Test
    @Tag("fast")
    @DisplayName("My final JUnit  test!")
	//this checks to make sure that enqueueing then dequeueing doesn't break isEmpty()
	public void testEmptyAfterDequeue() {
		queue.enqueue(5);
		queue.dequeue();
		assertTrue(queue.isEmpty());
	}
	

	
	
	
}