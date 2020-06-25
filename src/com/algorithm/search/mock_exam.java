package com.algorithm.search;
import java.util.*;

public class mock_exam {
    public static void main(String[] args) {
        int[] input = {1,3,2,4,2};

       int[] result = solution(input);

       for(int i=0; i< result.length; i++) {
           System.out.println(result[i]);
       }
    }

    public static int[] solution(int[] answers) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,1,2,3,2,4,2,5};
        int[] array3 = {3,3,1,1,2,2,4,4,5,5};

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,0);
        hm.put(2,0);
        hm.put(3,0);

        for(int i=0; i < answers.length; i++){
            // 정답
            int num = answers[i];

            if(array1[i%5] == num) {
                hm.replace(1, hm.get(1)+1);
            }
            if(array2[i%8] == num){
                hm.replace(2, hm.get(2)+1);
            }
            if(array3[i%10] == num){
                hm.replace(3, hm.get(3)+1);
            }
        }

        //최대값 구하기
        int max = Math.max(hm.get(1), Math.max(hm.get(2), hm.get(3)));

        // 정답 리스트
        ArrayList<Integer> answerList = new ArrayList<>();
        for(Integer key: hm.keySet()) {
            if(hm.get(key) == max){
                answerList.add(key);
            }
        }

        //정렬 및 배열로 변환
        int[] answer = new int[answerList.size()];
        //오름차순 정렬
        Collections.sort(answerList);
        for(int i=0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
