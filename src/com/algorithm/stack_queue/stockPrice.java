package com.algorithm.stack_queue;

public class stockPrice {
    public static void main(String[] args) {
        int[] price = {1,2,3,2,3};

        int[] answer = solution(price);

        for(int idx : answer){
            System.out.println(answer[idx]);
        }
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i < answer.length; i++){
            int count = 0;
            for(int j=i+1; j < answer.length; j++){
                //price 가격이 떨어지지 않을 경우 count를 증가
                if(prices[i] <= prices[j]){
                    count++;
                } else {
                    count++;
                    break;
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}

/*
 크키가 작은 price가 나오기 전에는 주식가격이 떨어지지 않는다.
 예를들어 1,2,3,2,3 이 있으면 1초의 1은 그 뒤에 더 작은 price가 나오지 않으므로
 끝까지 가격이 떨어지지 않아서 4초간 유지됩니다.
 3초 시점의 3은 바로 뒤에 더 작은 가격이 나오므로 1초 동안 유지되는 것으로 봅니다.
 */