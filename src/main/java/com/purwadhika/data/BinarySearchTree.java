package com.purwadhika.data;

import com.purwadhika.model.TreeNode;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(insertRec(root.getRight(), data));
        }
        return root;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(TreeNode root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.getData()) {
            return true;
        }
        return data < root.getData() ? searchRec(root.getLeft(), data) : searchRec(root.getRight(), data);
    }
}
