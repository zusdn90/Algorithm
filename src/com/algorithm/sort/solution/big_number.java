package com.algorithm.sort.solution;
import java.util.Arrays;
import java.util.Comparator;

public class big_number {
    public static void main(String[] args) {
        int [] array = {6,10,2};
        String result = solution(array);

        System.out.println(result);
    }

    public static String solution(int[] numbers) {
        String answer = "";

        // 1. input은 int형 배열이므로 단순 크기 비교로 정렬하기는 쉽지 않습니다. 정렬이 용이한 String형태로 변환
        String[] str_numbers = new String[numbers.length];

        for(int i=0; i < str_numbers.length; i++){
            str_numbers[i] = (String.valueOf(numbers[i]));
        }

        // 2. 배열 정렬, Comparator를 활용하여 규칙을 만들어 주는데, 두 String을 합하여 더 큰 쪽이 우선순위가 있도록 구성
        Arrays.sort(str_numbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        //3. 0000 처럼 0으로만 구성되어 있으면 0 return
        if (str_numbers[0].equals("0")) return "0";

        //4. 그외의 경우 순차적으로 연결하여 answer return
        for (int i =0; i < str_numbers.length; i++){
            answer += str_numbers[i];
        }
        return answer;
    }
}
