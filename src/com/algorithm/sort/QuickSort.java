package com.algorithm.sort;

import java.util.Scanner;

// 퀵 정렬 - 분할 정복 알고리즘
public class QuickSort {

    // a, b, c의 중앙값을 구하여 반환
    static int medianSelection(int a, int b, int c) {
        if(a>=b){
            if(b>=c){
                return b;
            }else if(a <= c){
                return a;
            }else{
                return c;
            }
        }else if(a > c){
            return a;
        }else if(b > c){
            return c;
        }else{
            return b;
        }
    }

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    // 단순삽입정렬
    static void insertionSort(int[] a, int left, int right) {
        for(int i = left+1; i <= right; i++) {
            int tmp = a[i];
            int j;
            for(j=i; j > left && a[j-1] > tmp; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right) {
        if (right - left < 9){
            insertionSort(a, left, right);
        } else {
            int pl = left;      // 왼쪽 커서
            int pr = right;     // 오른쪽 커서

            //int x = a[(pl + pr) / 2];  // 중앙값
            int x = medianSelection(a[pl], a[(pl+pr)/2], a[pr]);

            //정렬 진행과정 표시
            System.out.printf("a[%d]~a[%d] :  {", left, right);
            for (int i = left; i < right; i++) {
                System.out.printf("%d , ", a[i]);
            }
            System.out.printf("%d}\n", a[right]);

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;

                if (pl <= pr) {
                    swap(a, pl++, pr--);
                }
            } while (pl <= pr);

            if (pr -left < right - pl) {
                int temp;
                temp = left;
                left = pl;
                pl = temp;
                temp = right;
                right = pr;
                pr = temp;
            }


            if (left < pr) {
                quickSort(a, left, pr);
            }

            if (pl < right) {
                quickSort(a, pl, right);
            }
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i=0; i < nx; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx-1);  // 배열 x를 퀵정렬

        System.out.println("오름차순으로 정렬했습니다.");

        for (int i=0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
