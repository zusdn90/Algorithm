package com.algorithm.stack_queue;
import java.util.LinkedList;
import java.util.Queue;

public class top {
    public static void main(String[] args) {
        int[] sendTopArray = {6,9,5,7,4};
        int[] result = solution(sendTopArray);

        // 결과 출력
        for(int s: result){
            System.out.println(result[s]);
        }

    }

    public static int[] solution(int[] heights) {
        int[] answer = {};
        int heightTop = 0;

        //수신탑 큐
        Queue<Integer> reciveTop = new LinkedList<>();

        for (int i=heights.length; i >=1; i--){

            // 왼쪽으로 신호를 발사
            if(heights[i-2] > heights[i-1]) {

            }
        }


        return answer;
    }
}
