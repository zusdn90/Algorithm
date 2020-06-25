package com.algorithm;

import java.util.Scanner;


public class Practice_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();   //테스트 케이스

        for(int i = 0; i < T; i++) {

            int H = in.nextInt();   //층수
            int W = in.nextInt();   //층 별 방 갯수
            int N = in.nextInt();   //몇번쨰 손님

            if(N % H == 0) {
                System.out.println((H *100) + (N/H));
            } else {
                System.out.println(((N % H) *100) + ((N/H) + 1));
            }
        }

    }
}
