package com.purwadhika.data;

import com.purwadhika.model.Node;

public class Stack<T> {

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(top);
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        T poppedData = top.getData();
        top = top.getNext();
        return poppedData;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        System.out.println("Stack Info: ");
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
