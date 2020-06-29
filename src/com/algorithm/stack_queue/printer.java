package com.algorithm.stack_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class printer {
    public static void main(String[] args) {
        int[] priority = {2,1,3,2};
        int location = 2;
        //결과 1

        int[] input2 = {1, 1, 9, 1, 1, 1};
        int input3 = 0;
        //결과 5

        int answer = solution(priority, location);
        //System.out.println(answer);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int length = priorities.length;

        Queue<Integer> printer = new LinkedList<Integer>();

        // 우선순위 정렬 List
        ArrayList<Integer> priorityList = new ArrayList<>();
        // index 값 List
        ArrayList<Integer> indexList = new ArrayList<>();

        for(int idx : priorities){
            priorityList.add(idx);
        }

        //내림차순 정렬
        Collections.sort(priorityList);
        Collections.reverse(priorityList);

        for(int i=0;i<length; i++){
            System.out.println(priorityList.get(i));
        }

        for(int i=0; i<length; i++){
            int cnt = 0;


            if(location == i){
                printer.offer(priorities[i]);
                break;
            }
        }

        //System.out.println(printer.poll());


        return answer;
    }
}
