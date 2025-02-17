package com.purwadhika;

import com.purwadhika.data.Stack;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackIntegerTest {
    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    @Test
    void testPush() {
        stack.push(10);
        assertFalse(stack.isEmpty());
        assertEquals(10, stack.peek());
    }

    @Test
    void testPop() {
        stack.push(20);
        assertEquals(20, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeek() {
        stack.push(30);
        assertEquals(30, stack.peek());
        assertFalse(stack.isEmpty()); // Peek should not remove the item
    }

    @Test
    void testPopOnEmptyStack() {
        Exception exception = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Stack is empty. Cannot pop.", exception.getMessage());
    }

    @Test
    void testPeekOnEmptyStack() {
        Exception exception = assertThrows(IllegalStateException.class, stack::peek);
        assertEquals("Stack is empty. Cannot peek.", exception.getMessage());
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(40);
        assertFalse(stack.isEmpty());
    }
}
