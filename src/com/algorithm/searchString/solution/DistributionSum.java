package com.algorithm.searchString.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistributionSum {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String N = reader.readLine();

            int num = Integer.parseInt(N);
            int minValue = num;
            boolean flag = false;

            for(int i = num; i >= 0; i--){
                if(num == sum(i)){
                    if(minValue > i){
                        minValue = i;
                        flag = true;
                    }

                }
            }

            // 생성자가 없는 경우 0출력
            if(!flag){
                System.out.println(0);
            }

            System.out.println(minValue);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static int sum(int num){
        int result  = num;
        String str;
        char[] numArr = String.valueOf(num).toCharArray();

        for(int i=0; i< numArr.length; i++){
            result += Integer.parseInt(String.valueOf(numArr[i]));
        }

        return result;
    }


}
