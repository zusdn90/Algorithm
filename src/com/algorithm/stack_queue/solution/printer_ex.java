package com.algorithm.stack_queue.solution;

import java.util.LinkedList;

public class printer_ex {
    public static void main(String[] args) {
        int[] priority = {2,1,3,2};
        int location = 2;
        //결과 1

        int[] input2 = {1, 1, 9, 1, 1, 1};
        int input3 = 0;
        //결과 5

        int answer = solution(priority, location);
        System.out.println(answer);
    }

    public static int solution(int[] priorities, int location) {
        //중요도와 index를 넣을 LinkedList 생성
        LinkedList<Document> list = new LinkedList<Document>();

        for(int i=0; i < priorities.length; i++){
            list.add(new Document(i, priorities[i]));
        }

        //인쇄순번
        int answer = 1;
        //첫번째 Document
        Document firstDc = null;

        //대기목록을 순차적으로 체크
        while (list.size() > 1) {
            //list의 가장 처음값을 firstDc에 저장하고 그 다음값과 비교하여 중요도가 더 높은 문서가 있으면 맨뒤로 보냄
            firstDc = list.getFirst();

            for(int i = 1; i < list.size(); i++){
                //대기목록의 가장 마지막으로보냄
                if (firstDc.prioritie < list.get(i).prioritie) {
                    list.addLast(firstDc);
                    list.removeFirst();
                    break;
                }

                //인쇄
                if (i == list.size()-1){
                    if(firstDc.idx == location) return answer;
                    list.removeFirst();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static class Document {
        int idx;
        int prioritie;

        public Document(int idx, int prioritie){
            this.idx = idx;
            this.prioritie = prioritie;
        }
    }
}


