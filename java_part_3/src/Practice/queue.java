package Practice;

import java.util.*;

class A_person {
    String name;
    int age;

    public A_person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class queue {

    public static void exam2_2() {

        Comparator<A_person> ageComparator = new Comparator<A_person>() {
            public int compare(A_person a1, A_person a2) {
                return Integer.compare(a1.getAge(), a2.getAge());
            }
        };
        PriorityQueue priorityQueue = new PriorityQueue<>();

        // 요소추가
        priorityQueue.add(new A_person("Alice", 20));
        priorityQueue.add(new A_person("Bob", 30));
        priorityQueue.add(new A_person("Charlie", 10));
        priorityQueue.add(new A_person("David", 40));

        System.out.println("Peek : " + priorityQueue.peek());

    }


    public static void main(String[] args) {

    }
}
