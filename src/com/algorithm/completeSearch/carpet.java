package com.algorithm.completeSearch;

public class carpet {
    public static void main(String[] args) {
        int brown = 8;
        int yellow = 1;

        int[] answer = solution(brown, yellow);
        System.out.println("[" + answer[0] + "," + answer[1] + "]");
    }

    public static int[] solution(int brown, int yellow) {
        int width = 0;
        int height = 0;

        // 직사각형이기 떄문
        int length = (yellow / 2) + 1;

        //yellow를 기준으로 완전탐색
        for(int i=1; i<=length; i++){
            width = i;
            height = (yellow % i == 0) ? yellow / i : yellow / i + 1;

            //브라운은 엘로우보다 가로, 세로가 2씩 더 크므로 +4 한다.
            if(2*width + 2*height +4 == brown) break;
        }

        //max-가로 , min-세로
        int[] answer = {Math.max(width,height)+2, Math.min(width, height)+2};
        return answer;
    }
}
