package com.algorithm.dfs;

public class targetNumber {
    public static void main(String[] args) {
        int[]  number = {1,1,1,1,1};
        int target = 4;

        int answer = solution(number, target);

        System.out.println(answer);
    }

    static int answer = 0;
    public static int solution(int[] numbers, int target) {
        dfs(target, numbers, 0);
        return answer;
    }
    
    //DFS(깊이우선탐색)알고리즘 사용 +연산은 왼쪽 노드 방문, -연산은 오른쪽 노드 방문
    public static void dfs(int target, int[] numbers, int index){
        if(index == numbers.length){
            int sum = 0;
            for(int num : numbers) {
                sum += num;
            }
            if(sum == target){
                answer++;
            }
        } else {
            numbers[index] *= 1;
            //재귀호출
            dfs(target, numbers,index+1);

            numbers[index] *= -1;
            dfs(target, numbers,index+1);
        }
    }

}
