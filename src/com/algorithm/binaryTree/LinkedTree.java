package com.algorithm.binaryTree;

public class LinkedTree {
    private TreeNode root;

    public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2){
        TreeNode root = new TreeNode(data);
        root.left = bt1;
        root.right = bt2;

        return root;
    }

    // 전위 순회 DLR
    public void preorder(TreeNode root) {
        if(root != null){
            System.out.println(root.data + "");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // 중위 순회 LDR
    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data + "");
            inorder(root.right);
        }
    }

    // 후위 순회 LRD
    public void postorder(TreeNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data + "");
        }
    }
}
