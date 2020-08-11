package com.algorithm.sort.solution;

import java.util.*;

public class k_number {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};

        for(int i :  array1){
            System.out.print(i +" ");
        }

        System.out.println();

        int []  array2 = Arrays.copyOf(array1,3 );

        for(int i :  array2){
            System.out.print(i +" ");
        }

        System.out.println();

        int []  array3 = Arrays.copyOfRange(array1,3,4);    //copyOfRange(배열, 시작인덱스, 종료인덱스) 메소드는 시작인덱스는 포함하고, 종료인덱스는 포함하지 않는다.

        for(int i :  array3){
            System.out.print(i +" ");
        }

    }


}
