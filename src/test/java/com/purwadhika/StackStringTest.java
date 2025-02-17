package com.purwadhika;

import com.purwadhika.data.Stack;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackStringTest {

    private Stack<String> stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    @DisplayName("Test Case 1: Check if the stack is empty initially")
    public void testStackIsEmptyInitially() {
        assertTrue(stack.isEmpty(), "Stack should be empty initially");
    }

    @Test
    @DisplayName("Test Case 2: Push one element to the stack and check if it's on top")
    public void testPushOneElement() {
        stack.push("Hello");
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");
        assertEquals("Hello", stack.peek(), "Top element should be 'Hello'");
    }

    @Test
    @DisplayName("Test Case 3: Push another element and check the top of the stack")
    public void testPushMultipleElements() {
        stack.push("Hello");
        stack.push("World");
        assertEquals("World", stack.peek(), "Top element should be 'World' after pushing 'Hello' and 'World'");
    }

    @Test
    @DisplayName("Test Case 4: Pop one element and check the new top")
    public void testPopElement() {
        stack.push("Hello");
        stack.push("World");
        String popped = stack.pop();
        assertEquals("World", popped, "Popped element should be 'World'");
        assertEquals("Hello", stack.peek(), "Top element should be 'Hello' after popping 'World'");
    }

    @Test
    @DisplayName("Test Case 5: Pop the last element and check if stack is empty")
    public void testPopLastElement() {
        stack.push("Hello");
        String popped = stack.pop();
        assertEquals("Hello", popped, "Popped element should be 'Hello'");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping the last element");
    }

    @Test
    @DisplayName("Test Case 6: Try to pop from an empty stack (should throw an exception)")
    public void testPopEmptyStack() {
        assertThrows(IllegalStateException.class, stack::pop, "Popping from an empty stack should throw IllegalStateException");
    }

    @Test
    @DisplayName("Test Case 7: Push and print the entire stack (Checking correct order)")
    public void testPrintStack() {
        stack.push("Java");
        stack.push("Programming");
        stack.push("Stack");

        assertEquals("Stack", stack.peek(), "Top element should be 'Stack' after pushing 'Java', 'Programming', 'Stack'");
    }
}
