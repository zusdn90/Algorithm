package com.algorithm.binarySearchTree;

public class BinarySearchTree {
    private TreeNode root = new TreeNode();

    public TreeNode insertKey(TreeNode root, int x){
        TreeNode p = root;  //루트 노드
        TreeNode newNode = new TreeNode(x); //추가할 노드

        if(p == null){
            return newNode;
        }else if(p.data > newNode.data){
            p.left = insertKey(p.left,x);
            return p;
        }else if(p.data < newNode.data){
            p.right = insertKey(p.right,x);
            return p;
        }else{
            return p;
        }
    }

    public void insertBST(int x){
        root = insertKey(root,x);
    }

    public TreeNode searchBST(int x){
        TreeNode p = root;

        while(p!=null){
            if(x<p.data){
                p = p.left;
            }else if(x>p.data){
                p = p.right;
            }else{
                return p;
            }
        }

        return p;
    }

    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data + "");
            inorder(root.right);
        }
    }

    public void printBST(){
        inorder(root);
        System.out.println();
    }
}
