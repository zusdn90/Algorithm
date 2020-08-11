package com.algorithm.stack_queue.solution;

import java.util.LinkedList;
import java.util.Queue;

public class truck {

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight_array = {7,4,5,6};

        int result = solution(bridge_length, weight,truck_weight_array);

        System.out.println(result);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        // 다리를 건너기 전에 대기 트럭 리스트
        Queue<BridgeTruck> q_wait = new LinkedList<BridgeTruck>();
        // 다리를 건너는 트럭 리스트
        Queue<BridgeTruck> q_onBridge = new LinkedList<BridgeTruck>();

        int onBridgeWeight = 0;

        // 다리를 건너기 전에 대기 트럭 큐에 트럭별 무게 삽입 / 거리는 0
        for (int w: truck_weights) {
            q_wait.offer(new BridgeTruck(w,0));
        }

        onBridgeWeight += q_wait.peek().weight;


        q_onBridge.offer(q_wait.poll());

        int time = 0;

        while (!q_onBridge.isEmpty()) {
            time++;

            for(BridgeTruck t: q_onBridge) {
                // 다리위 트럭들을 움직인다.
                t.distance++;
            }

            // 트럭이 다리 끝에 다다름
            if (q_onBridge.peek().distance > bridge_length){
                onBridgeWeight -= q_onBridge.poll().weight;
            }

            // 대기 중 트럭을 다리에 올림 (무게 고려)
            if (!q_wait.isEmpty() && q_wait.peek().weight + onBridgeWeight <= weight) {
                onBridgeWeight += q_wait.peek().weight;
                q_wait.peek().distance++;
                q_onBridge.offer(q_wait.poll());
            }
        }

        answer = time;

        return answer;
    }

    public static class BridgeTruck {
        int weight;
        int distance;

        public BridgeTruck(int weight, int distance){
            this.weight = weight;
            this.distance = distance;
        }
    }

}






/*
[풀이 방법]
큐를 두 개 사용
다리를 건너기 위해 기다리는 트럭의 리스트 / 다리를 건너는 중인 트럭들의 리스트

큐에 트럭 값을 적절히 넣고 빼주면서 트럭을 움직입니다.

트럭을 움직일 수 있는 길이의 제한은 다리의 길이입니다.

즉, 트럭의 위치가 다리의 길이가 되면 트럭은 다리의 끝까지 도달했고 이제 큐에서 제거하면 됩니다.
큐에서 트럭 하나가 빠져나갔다고 바로 대기 중인 트럭이 탑승할 수 있는 건 아닙니다.

현재 다리 위에 있는 트럭들의 무게와 대기 큐의 가장 앞 순번의 트럭의 무게 합이 다리가 감당할 수 있는 무게의 범위 내여야 합니다.

이를 고려해서 조건을 세운 후 다리 위에 올려줍니다.

대기 큐와 다리 위의 트럭 큐가 모두 empty 상태가 되면 큐를 탐색할 동안 1씩 증가하던 time 또는 answer 이 정답입니다.
 */