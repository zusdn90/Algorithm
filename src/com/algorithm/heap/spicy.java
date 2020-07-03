package com.algorithm.heap;

import java.util.PriorityQueue;

//프로그래머스 Heap 더 맵게 문제
public class spicy {
    public static void main(String[] args) {
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int K = 7;

        int answer = solution(scovile, K);

        System.out.println(answer);
    }

    public static int solution(int[] scoville, int K) {
        //PriorityQueue 활용 - 기본 내림차순 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i : scoville) {
            pq.add(i);
        }

        int cnt =0;

        while (true) {
            if(pq.peek() >= K) break;
            // 모든 음식의 스코빌 지수를 K이상으로 만들수 없는 경우에 -1 return
            if(pq.size() ==1) return -1;

            pq.add(pq.poll()+(pq.poll()*2));
            cnt++;
        }
        return cnt;
    }

}
