package com.algorithm.recursion.ch05;

import java.util.Scanner;

public class factorial {

    //양의 정수 n의 팩토리얼을 반홥합니다.
    static int factorial(int n){
        if (n > 0){
            return n * factorial(n-1);
        } else {
          return 1;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }

}
