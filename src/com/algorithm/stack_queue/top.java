package com.algorithm.stack_queue;
import java.util.Stack;

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
        int[] answer = new int[heights.length];
        //수신탑 스택
        Stack<Integer> reciveTop = new Stack<Integer>();

        for (int i=heights.length-1; i >0; i--){
            for (int j=i-1; j>=0; j--){
                if(heights[j] > heights[i]){
                    reciveTop.push(j+1);
                    break;
                }
                if(j==0) reciveTop.push(0);
            }
        }

        answer[0]=0;
        for(int i=1; i < heights.length; i++){
            answer[i] = reciveTop.pop();
        }

        return answer;
    }
}
