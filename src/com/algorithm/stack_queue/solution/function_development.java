package com.algorithm.stack_queue.solution;

import java.util.*;

public class function_development {
    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        int[] result = solution(progresses, speeds);

        // 결과값 출력
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        //progresses 배열 복사
        int[] pro = progresses;

        //배포수 저장
        Queue<Integer> result = new LinkedList<>();
        //배포할 수 있는 기준
        int index =0;
        //한번에 배포되는 수
        int count=0;

        while(index < pro.length) {
            //하루 진도율 처리
            for(int i=0; i<pro.length; i++) {
                pro[i] += speeds[i];
            }

            if(pro[index] >= 100){  //index작업이 배포될 수 있으면
                while(index < pro.length && pro[index] >= 100) { // 다른것도 같이 배포될 수 있는지 체크
                    count++;
                    index++;
                }

                result.offer(count);     //한번에 배포된 개수 저장
                count = 0;
            }
        }

        //정답 배열
        int[] answer = new int[result.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = result.poll();
        }
        return answer;
    }
}
