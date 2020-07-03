package com.algorithm.stack_queue;

import java.util.Stack;

public class ironBar {
    public static void main(String[] args) {
        String arragement = "()(((()())(())()))(())";

        int answer = solution(arragement);

        System.out.println(answer);

    }

    public static int solution(String arrangement) {
        int answer = 0;

        //Stack 후입선출
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<arrangement.length(); i++){
            if (arrangement.charAt(i) == '('){
                stack.add(arrangement.charAt(i));
            }else {
                stack.pop();
                //레이저
                if(arrangement.charAt(i-1) == '(') {
                     answer += stack.size();
                //막대기 끝
                }else {
                    answer++;
                }
            }
        }


        return answer;
    }
}
