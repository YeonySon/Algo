package 알고리즘과목평가;

import java.util.Arrays;

public class 원형큐구현 {

    static int[] arr;
    static int front = 0, rear = 0;

    static int maxSize = 5; //배열 최대 크기

    public static void main(String[] args) {

        arr = new int[maxSize];
        enqueue(1);
        enqueue(2);
        System.out.println(dequeue());
        System.out.println(Arrays.toString(arr));


    }


    //enqueue

    static void enqueue(int num) {

        if (isFull()) {
            System.out.println("꽉차이었요");
        } else {
            rear = (rear + 1) % maxSize;
            arr[rear] = num;
        }
    }

    static int dequeue() {

        if (isEmpty()) {
            System.out.println("비어있어서 디큐못해요");
        } else {

            front = (front + 1) % maxSize;
            return arr[front];
        }
        return -1;
    }

//    static int peek(){
//
//    }

    static int size() {

        return (maxSize + rear - front) % maxSize;


    }

    static boolean isEmpty() {

        return front == rear;

    }

    static boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    static void print() {
        if (!isEmpty()) {
            int size = size();
            for (int i = 1; i <= size; i++) {
                System.out.print(arr[(front + i) % maxSize] + " ");
            }
            System.out.println();
        }
    }

}
