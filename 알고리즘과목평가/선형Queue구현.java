package 알고리즘과목평가;

public class 선형Queue구현 {


    static int[] arr;
    static int size = 0;
    static int front = -1, rear = -1;



    static void enqueue(int num){

        rear = (rear+1)%arr.length;

        arr[++rear] = num;
        size++;


    }



}
