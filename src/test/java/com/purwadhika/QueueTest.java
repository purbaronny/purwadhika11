package com.purwadhika;

import com.purwadhika.data.Queue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueueTest {

    private Queue<Integer> intQueue;
    private Queue<String> strQueue;

    @BeforeEach
    public void setUp() {
        intQueue = new Queue<>();
        strQueue = new Queue<>();
    }

    @Test
    @DisplayName("Test Case 1: Check if the integer queue is empty initially")
    public void testIntQueueIsEmptyInitially() {
        assertTrue(intQueue.isEmpty(), "Integer Queue should be empty initially");
    }

    @Test
    @DisplayName("Test Case 2: Check if the string queue is empty initially")
    public void testStrQueueIsEmptyInitially() {
        assertTrue(strQueue.isEmpty(), "String Queue should be empty initially");
    }

    @Test
    @DisplayName("Test Case 3: Enqueue an integer and check the front element")
    public void testEnqueueInteger() {
        intQueue.enqueue(5);
        assertFalse(intQueue.isEmpty(), "Integer Queue should not be empty after enqueue");
        assertEquals(5, intQueue.peek(), "Front element should be 5");
    }

    @Test
    @DisplayName("Test Case 4: Enqueue a string and check the front element")
    public void testEnqueueString() {
        strQueue.enqueue("Hello");
        assertFalse(strQueue.isEmpty(), "String Queue should not be empty after enqueue");
        assertEquals("Hello", strQueue.peek(), "Front element should be 'Hello'");
    }

    @Test
    @DisplayName("Test Case 5: Dequeue an integer and check the front element")
    public void testDequeueInteger() {
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        int dequeued = intQueue.dequeue();
        assertEquals(10, dequeued, "Dequeued element should be 10");
        assertEquals(20, intQueue.peek(), "Front element should now be 20 after dequeue");
    }

    @Test
    @DisplayName("Test Case 6: Dequeue a string and check the front element")
    public void testDequeueString() {
        strQueue.enqueue("Java");
        strQueue.enqueue("Queue");
        String dequeued = strQueue.dequeue();
        assertEquals("Java", dequeued, "Dequeued element should be 'Java'");
        assertEquals("Queue", strQueue.peek(), "Front element should now be 'Queue' after dequeue");
    }

    @Test
    @DisplayName("Test Case 7: Dequeue from an empty queue (should throw exception)")
    public void testDequeueFromEmptyQueue() {
        assertThrows(IllegalStateException.class, intQueue::dequeue, "Dequeueing from an empty queue should throw IllegalStateException");
        assertThrows(IllegalStateException.class, strQueue::dequeue, "Dequeueing from an empty queue should throw IllegalStateException");
    }

    @Test
    @DisplayName("Test Case 8: Peek into an empty queue (should throw exception)")
    public void testPeekEmptyQueue() {
        assertThrows(IllegalStateException.class, intQueue::peek, "Peeking into an empty queue should throw IllegalStateException");
        assertThrows(IllegalStateException.class, strQueue::peek, "Peeking into an empty queue should throw IllegalStateException");
    }

    @Test
    @DisplayName("Test Case 9: Enqueue multiple integers and print the queue")
    public void testEnqueueMultipleIntegers() {
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        assertEquals(1, intQueue.peek(), "Front element should be 1 after enqueueing 1, 2, 3");
    }

    @Test
    @DisplayName("Test Case 10: Enqueue multiple strings and print the queue")
    public void testEnqueueMultipleStrings() {
        strQueue.enqueue("One");
        strQueue.enqueue("Two");
        strQueue.enqueue("Three");
        assertEquals("One", strQueue.peek(), "Front element should be 'One' after enqueueing 'One', 'Two', 'Three'");
    }
}
