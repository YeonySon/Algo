package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class 병합정렬124060 {
    static Scanner sc;
    static int[] arr;
    static int[] tmp;
    static int N;
    static int K;

    static int cnt;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        arr = new int[N];
        tmp = new int[N];

        cnt = 0;
        merge_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void merge_sort(int[] arr, int left, int right) {


            int mid = (left+right)/2;
            merge_sort(arr,left,mid);
            merge_sort(arr,mid+1, right);
            merge(arr,left,mid,right);

    }

    private static void merge(int[] arr, int left, int mid, int right) {
        
        int l = left; // 왼쪽부분
        int r = mid+1; // 오른쪽부분
        int t = l;

        while(l<=mid && r<=right){

            if(arr[l]<=arr[r]){
                tmp[t] = arr[l];
                l++;
                cnt++;
                if(cnt==K)
                    System.out.println(tmp[t]);
            } else{
                tmp[l] = arr[r];
                r++;
                cnt++;
                if(cnt==K)
                    System.out.println(tmp[t]);
            }

            t++;


        }

        while(l<=mid){
            tmp[t++] = arr[l++];
            cnt++;
            if(cnt==K)
                System.out.println(tmp[t]);
        }

        while(r<=right){
            tmp[t++] = arr[r++];
            cnt++;
            if(cnt==K)
                System.out.println(tmp[t]);
        }




        for(int i=0; i<tmp.length; i++)
            arr[i] = tmp[i];



    }
}
