package com.algorithm.stack_queue;

import java.util.ArrayList;

public class function_development_ex {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(progresses, speeds);

        // 결과값 출력
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        //정답 arrayList
        ArrayList<Integer> answerList = new ArrayList<>();
        //기능마다 걸리는 일수 계산 arrayList
        ArrayList<Integer> arrList = new ArrayList<>();

        // 기능마다 걸리는 일 수 계산
        for(int i=0; i < progresses.length; i++){
            int cnt = 0;

            while(true){
                progresses[i] += speeds[i];
                cnt++;

                if(progresses[i] >= 100){
                    arrList.add(cnt);
                    break;
                }
            }
        }

        //일수
        int cnt = 1;
        int j=0;

        //기능마다 걸리는 일수로 배포를 판단
        //앞의 수가 더 크면 작은 수를 지우고 cnt 증가 {7,3,9}
        while (true){
            if(arrList.get(j) >= arrList.get(j+1)){
                arrList.remove(j+1);
                cnt++;
            }else {
                j++;
                answerList.add(cnt);
                cnt = 1;
            }

            if(arrList.size() -1 == answerList.size()){
                answerList.add(cnt);
                break;
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

}
