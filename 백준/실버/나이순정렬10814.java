package 백준.실버;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 나이순정렬10814 {
    //나이순정렬 나이 같으면 이름순으로

    static class Person {
        int age;
        String name;

        int idx;

        Person(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        PriorityQueue<Person> pq = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if(o1.age == o2.age)
                    return o1.idx - o2.idx;

                return o1.age - o2.age;
            }
        });

        for(int i=0; i<T; i++){
            pq.add(new Person(sc.nextInt(), sc.next(), i));
        }

        while (pq.size()!=0){
            Person p = pq.poll();
            System.out.println(p.age + " " +p.name);
        }


    }
}
