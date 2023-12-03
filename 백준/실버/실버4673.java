package 백준.실버;

public class 실버4673 {
    public static void main(String[] args) {

        //셀프넘버, ex)33 -> 33+3+3 39 -> 39+3+9 51
        //101의 경우 91과 100이라는 생성자를 가짐
        //셀프넘버는 이런 생성자가 1개인 경우
        
        //boolean 타입의 배열로 1~10000받아야 하므로 10001크기로 설정
        boolean[] arr = new boolean[10001];
        
        for (int i =1; i<10001; i++){
            int index = d(i);
            
            //받은 index값으로 return 받은게 있으면 true로 초기화
            if (index < 10001){
                arr[index] = true;
            }
        }


        //true가 아닐 때 차례로 출력
        for (int i =1; i<10001; i++){
            if (arr[i] == false){
                System.out.println(i);
            }
        }
    }


    public static int d(int num){

        int total = 0;

        while (num != 0){
            //자리수마다 짤라서 더하기
            total = total + (num%10);
            //나눈수의 몫을 다시 초기화
            num = num / 10;

        }
        //리턴 값이 있다는건 생성자가 있다는 것
        return total;
    }


}
