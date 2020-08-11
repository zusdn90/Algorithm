package com.algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhyscExamSort {
    // 신체검사 데이터
    static class PhyscData{
        String name;    // 이름
        int height;     // 키
        double vision;  // 시력

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 키 오름차순 comparator
        static final Comparator<PhyscData> HEIGHT_ORDER = new HeighOrderComparator();

        private static class HeighOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("홍현우", 174, 0.3),
                new PhyscData("홍현우1", 173, 0.2),
                new PhyscData("홍현우2", 165, 0.1),
                new PhyscData("홍현우3", 134, 0.6),
                new PhyscData("홍현우4", 154, 0.7),
                new PhyscData("홍현우5", 123, 0.9)
        };

        Arrays.sort(x, PhyscData.HEIGHT_ORDER); // 배열 x를 HEIGHT_ORDER를 사용하여 정렬

        System.out.println("■ 신체검사 리스트 ■ ");
        System.out.println(" 이름    키    시력");
        System.out.println("--------------------------------------");
        for (int i=0; i < x.length; i++){
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
    }
}
