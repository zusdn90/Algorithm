package com.algorithm.dfs;

import java.util.LinkedList;

public class sample {

    public static void main(String[] args) {

    }

    /* 인접 리스트를 이용한 방향성 있는 그래프 클래스 */
    public static class Graph{
        private int V;      //노드의 개수
        private LinkedList<Integer> adj[];  //인접 리스트

        // 생성자
        Graph(int v){
            V = v;
            adj = new LinkedList[v];

            for(int i=0; i<v; i++){
                adj[i] = new LinkedList();
            }
        }

        //노드 연결(v->w)
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

    }
}
