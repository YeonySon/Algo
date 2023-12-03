package 백준.브론즈;


import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {

        //완전탐색

        Scanner sc = new Scanner(System.in);

        int res = sc.nextInt(); // 숫자개수
        int target = sc.nextInt(); // 블랙잭

        int[] arr = new int[res];
        for(int i=0; i<res; i++)
            arr[i] = sc.nextInt();


        int check = check(arr, res, target);

        System.out.println(check);



    }




    static int check(int[] arr, int n, int m) {
        int result = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]>m) continue; // 만약에 첨 뽑은 수가 21보다 크면 무시
            //앞서 뽑은 수와 다른 수가 나와야하므로 시작이 i+1
            //그리고 n-1전까지
            for(int j=1+i; j<n-1; j++) {
                //만약에 첫번째 카드랑 두번째 카드를 합산했더니 21보다 크면 무시
                if(arr[i]+arr[j]>m) continue; 
                //똑같이 두번째랑 겹치지 않기 위해 j+1부터 이번에는 마지막카드니깐
                //n전까지
                for(int k=1+j; k<n; k++) {
                    int temp = arr[i] + arr[j] +arr[k];
                    if(temp == m) //만약 합산이 21과 같으면 return
                        return temp;
                    else {
                        //만약 21보다 작다면 그거에 근접한걸 찾아야하므로
                        //앞에 result라는 변수를 설정해주었고
                        //temp를 result에 담아줘서
                        //result값은 계속 초기화되면서
                        //최종적으로는 가장가까운 합으로 return
                        if(result<temp && temp<m) {
                            result = temp;
                        }
                    }

                }
            }
        }

        return result;

    }
}
