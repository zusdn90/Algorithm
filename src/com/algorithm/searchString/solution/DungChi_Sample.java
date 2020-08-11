package com.algorithm.searchString.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DungChi_Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(reader.readLine());
            // 몸무게&키 배열
            String[] members = new String[N];

            for(int i=0; i<N; i++){
                members[i] = reader.readLine();
            }

            //등수 배열
            int[] grade = grade(members);

            //출력
            print(grade);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    // 순위
    private static int[] grade(String[] members){
        //System.out.println(members.length);

        int[] grade = new int[members.length];

        for(int i=0; i<members.length; i++){
            String[] member = members[i].split(" ");
            int weight = Integer.parseInt(member[0]);
            int height = Integer.parseInt(member[1]);

            grade[i] = compare(members, weight, height);
        }

        return grade;
    }

    // 덩치 비교
    private static int compare(String[] members, int weightA, int heightA){
        int cnt = 1;

        for(int j=0; j < members.length; j++){
            String[] tmpMember = members[j].split(" ");
            int weightB = Integer.parseInt(tmpMember[0]);
            int heightB = Integer.parseInt(tmpMember[1]);

            if((weightA < weightB) && (heightA < heightB)){
                cnt++;
            }
        }
        return cnt;
    }

    //출력
    private static void print(int[] grade){
        for(int i=0; i<grade.length; i++){
            System.out.print(grade[i]);
            System.out.print(" ");
        }
    }
}
