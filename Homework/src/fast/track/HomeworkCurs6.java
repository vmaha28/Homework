package fast.track;


import java.util.ArrayList;
import java.util.List;


public class HomeworkCurs6 {
    public static void main(String[] args) {
        //Ex1();
        //Ex2();
        Ex3();


    }

    public static void Ex1() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 2);
        list.add(4);
        list.add(5);
        list.add(8);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            System.out.println(sum);
        }

    }

    public static void Ex2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(11);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void Ex3() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(11);
        int a = 5;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > a) {
                System.out.println(list.get(i));
            }
        }



    }
}
