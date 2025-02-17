package com.purwadhika;

import com.purwadhika.data.BinarySearchTree;
import com.purwadhika.data.Queue;
import com.purwadhika.data.Stack;

import java.util.Scanner;

public class Practice11 {

    public static void main(String[] args) {
        // Write a Java stack program that can scale dynamically
        System.out.println("Write a Java stack program that can scale dynamically");
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        stack.printStack();

        // Write a Java queue program that can scale dynamically
        System.out.println("Write a Java queue program that can scale dynamically");
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());

        queue.printQueue();

        // Write a Java binary search tree program that can scale dynamically
        System.out.println("Write a Java binary search tree program that can scale dynamically");
//        Scanner scanner = new Scanner(System.in);
//        BinarySearchTree bst = new BinarySearchTree();
//
//        System.out.print("Enter the number of elements to insert: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Enter " + n + " numbers:");
//        for (int i = 0; i < n; i++) {
//            bst.insert(scanner.nextInt());
//        }
//
//        while (true) {
//            System.out.print("Enter a number to search (-1 to exit): ");
//            int searchValue = scanner.nextInt();
//            if (searchValue == -1) {
//                break;
//            }
//            if (bst.search(searchValue)) {
//                System.out.println(searchValue + " is found in the BST.");
//            } else {
//                System.out.println(searchValue + " is not found in the BST.");
//            }
//        }
//
//        scanner.close();
    }
}
