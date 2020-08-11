package com.algorithm.sort.solution;

import java.util.Arrays;
import java.util.Collections;

public class h_index {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};

        int answer = solution(citations);

        System.out.println(answer);

    }

    public static int solution(int[] citations) {
        int answer = 0;

        Integer[] orderCitations = new Integer[citations.length];

        for(int i=0; i < orderCitations.length; i++){
            orderCitations[i] = citations[i];
        }

        //내림차순으로 정렬된 배열
        Arrays.sort(orderCitations, Collections.reverseOrder());

        for(int i=0; i < citations.length; i++){
            if(orderCitations[i] < i+1){
                return i;
            }
        }

        answer = citations.length;

        return answer;
    }
}
