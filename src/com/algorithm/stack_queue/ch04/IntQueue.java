package com.algorithm.stack_queue.ch04;

public class IntQueue {
    private int max;    // 큐용량
    private int front;  // 첫번째 요소 커서
    private int rear;   // 마지막 요소 커서
    private int num;    // 현재 데이터 수
    private int[] que;  // 큐 본체

    //실행 시 예외 : 큐가 비어있음
    public class EmptyInQueueException extends RuntimeException {
        public EmptyInQueueException() {}
    }

    //실행 시 예외 : 큐가 가득참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    // 생성자
    public IntQueue(int capacity) {
        num = front = rear =0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // 큐에 데이터를 인규
    public int enque(int x) throws OverflowIntQueueException {
        if (num == max) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;

        if(rear == max) rear =0;

        return x;
    }

    // 큐에 데이터를 디큐
    public int deque() throws EmptyInQueueException {
        if (num == 0) {
            throw new EmptyInQueueException();
        }

        int x = que[front++];
        num--;
        if (front == max) front = 0;

        return x;
    }

    //큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public int peek() throws EmptyInQueueException {
        if (num == 0) throw new EmptyInQueueException();

        return que[front];
    }

    //큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(int x) {
        for (int i=0; i<num; i++){
            int idx = (i + front) % max;
            if(que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    //큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    //큐의 용량을 반환
    public int capacity() {
        return max;
    }

    //큐에 쌓여있는 데이터수를 반환
    public int size() {
        return num;
    }

    //큐가 비어있는지 확인
    public boolean isEmpty() {
        return num == 0;
    }

    //큐가 가득찼는지 확인
    public boolean isFull() {
        return num == max;
    }

    // 큐안의 모든 데이터를 프런트 -> 리어 순으로 출력
    public void dump() {
        if (num == 0) {
            System.out.println("큐가 비어 있습니다.");
        }else {
            for(int i=0; i<num; i++) {
                System.out.print(que[(i+front)%max] + " ");
            }
            System.out.println();
        }
    }

    public int search(int x) {
        for(int i=0; i<num; i++){
            int idx = (i+front) % max;
            if(que[idx] == x){
                return (i+1);
            }
        }
        return 0;
    }
}
