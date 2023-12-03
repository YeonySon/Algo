package Thread;

import javax.swing.*;

public class ThreadTest {

    public static boolean inputCheck = false;

    public static void main(String[] args) {
        Thread th1 = new DataInput();
        Thread th2 = new CountDown();

        th1.start();
        th2.start();


    }
}

class DataInput extends Thread{

    @Override
    public void run() {

        String str = JOptionPane.showInputDialog("아무거나 입력하세요.");
        ThreadTest.inputCheck = true;

        System.out.println("입력하신 내용은" + str + "입니다.");


    }
}

class CountDown extends Thread{

    @Override
    public void run() {

        for (int i = 10; i >=1; i--) {

            if (ThreadTest.inputCheck){
                return;
            }
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("10초 지났어요.");
        System.exit(0);

    }
}
