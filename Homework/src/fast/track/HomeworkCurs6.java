package fast.track;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkCurs6 {
    public static void main(String[] args) {
        Ex1();



    }
    public static void Ex1(){
        List<Integer> list = new ArrayList<>();
        list.add(0, 2);
        list.add(4);
        list.add(5);
        list.add(8);
        int sum= 0;
        for (int i = 0; i < list.size(); i++) {
            sum +=list.get(i);
            System.out.println(sum);
        }

    }
}
