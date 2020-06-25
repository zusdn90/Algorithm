package com.algorithm.stack_queue;
import java.util.LinkedList;
import java.util.Queue;

public class top {
    public static void main(String[] args) {
        int[] sendTop = {6,9,5,7,4};

        int[] result = solution(sendTop);

        // 결과 출력
        for(int s: result){
            System.out.println(result[s]);
        }

    }

    public static int[] solution(int[] heights) {
        int[] answer = {};

        //수신탑 큐
        Queue<Integer> reciveTop = new LinkedList<>();




        return answer;
    }
}
