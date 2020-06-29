package com.algorithm.stack_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class printer_ex1 {
    public static void main(String[] args) {
        int[] priority = {2,1,3,2};
        int location = 2;
        //결과 1

        int[] input2 = {1, 1, 9, 1, 1, 1};
        int input3 = 0;
        //결과 5

        int answer = solution(input2, input3);
        System.out.println(answer);
    }

    public static int solution(int[] priorities, int location) {
        //인쇄 순서를 1로 초기화
        int answer = 1;
        
        //우선순위 큐 활용 - 높은 우선순위가 있으면 출력
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int priority : priorities) {
            pq.offer(priority);
        }

        while (!pq.isEmpty()) {
            for (int i=0; i<priorities.length; i++){
                //큐의 첫번째 값을 가져온다 . peek()
                if(pq.peek() == priorities[i]){
                   if(i == location) {
                       return answer;
                   }
                   pq.poll();
                   answer++;
                }
            }
        }

        return  answer;
    }
}
/*
우선 작업들의 우선순위를 priority queue에 넣는다.
그리고 priority queue가 비어질 때까지 반복문을 돌리며,
우선순위 큐에서 가장 우선순위가 높은 작업이 해당 배열 priorities[i]의 우선순위와 같은지 비교하고
같으면 우선순위 큐를 poll하고, poll이 된 개수를 카운트한다.

작업 배열 priorities[]의 인덱스를 location변수와 같을 때 카운트된 것 리턴!

 */