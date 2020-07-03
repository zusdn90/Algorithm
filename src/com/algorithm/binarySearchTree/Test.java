package com.algorithm.binarySearchTree;

public class Test {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertBST(20);
        bst.insertBST(32);
        bst.insertBST(11);
//        bst.insertBST('D');
//        bst.insertBST('B');
//        bst.insertBST('M');
//        bst.insertBST('N');
//        bst.insertBST('A');
//        bst.insertBST('J');
//        bst.insertBST('E');
//        bst.insertBST('Q');

        System.out.println("Binary Tree >>>");
        bst.printBST();

        System.out.println("Is There \"A\" ? >>> ");
        TreeNode p1 = bst.searchBST(11);
        if(p1!=null){
            System.out.println(p1.data + ": 탐색 성공");
        }else{
            System.out.println("탐색 실패");
        }
    }
}
