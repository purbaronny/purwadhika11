package com.purwadhika.data;

import com.purwadhika.model.Node;

public class Queue<T> {

    private Node<T> front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.setNext(newNode);
        rear = newNode;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        T dequeuedData = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return dequeuedData;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return front.getData();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        System.out.println("Queue Info");
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
