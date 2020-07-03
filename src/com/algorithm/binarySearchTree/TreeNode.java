package com.algorithm.binarySearchTree;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){
        this.left = null;
        this.right = null;
    }

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Object getData(){
        return data;
    }
}
