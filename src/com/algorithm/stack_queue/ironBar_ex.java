package com.algorithm.stack_queue;

import java.util.ArrayList;
import java.util.Stack;

public class ironBar_ex {
    public static void main(String[] args) {
        String arragement = "()(((()())(())()))(())";
        int answer = solution(arragement);

        System.out.println(answer);
    }

    public static int solution(String arrangement) {
        //레이저를 0으로 치환
        String copyArray = arrangement.replace("()","0");
        int answer = 0;

        ArrayList<Character> copy = new ArrayList<Character>();
        ArrayList<Character> stack = new ArrayList<Character>();

        for(int i=0; i<copyArray.length(); i++){
            copy.add(copyArray.charAt(i));
        }

        //copy ArrayList에서 '('를 만나면 stack ArrayList에 쌓는다.
        for(int i=0; i<copy.size(); i++){
            if(copy.get(i) == '('){
                stack.add(copy.get(i));
            }else if(copy.get(i) == '0'){
                answer += stack.size();
            }else if(copy.get(i) == ')'){
                //막대기의 끝이므로 맨위에 쌓인 '('를 빼준다.
                stack.remove(stack.size()-1);
                answer += 1;
            }
        }

        return answer;
    }
}
