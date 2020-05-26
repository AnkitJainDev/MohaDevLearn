package com.company;

public class IntTreeNode {
    // An IntTreeNode object is one node in a binary tree of ints.

    int data;           // data stored at this node
    IntTreeNode left;   // reference to left subtree
    IntTreeNode right;  // reference to right subtree

    public IntTreeNode(int data){
// Constructs a leaf node with the given data.
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right){
        // Constructs a branch node with the given data and links.

        this.data=data;
        this.left=left;
        this.right=right;

    }

}

