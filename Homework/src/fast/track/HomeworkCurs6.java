package fast.track;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HomeworkCurs6 {
    public static void main(String[] args) {
        //Ex1();
        //Ex2();
        //Ex3();
        //Ex4(80);
        //Ex5(100, 1);
        Ex6("Ana are mere.Vlad e baiat.Marius e un nume random.");


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

    public static void Ex4(int donatii) {

        Random r = new Random();
        int totalDonatii = 0;
        while (donatii > totalDonatii) {
            totalDonatii += r.nextInt(donatii);
        }
        System.out.println("Targetul a fost atins " + totalDonatii + " atat am strans!");


    }

    public static void Ex5(int donatii, int contor) {

        Random r = new Random();
        int totalDonatii = 0;
        for (int i = 0; i < contor; i++) {
            if (totalDonatii < donatii) {
                totalDonatii += r.nextInt(donatii);
            }
        }
        System.out.println("S-a strans suma de " + totalDonatii);
        if (totalDonatii < donatii) System.out.println("Asta este, a fost o campanie ineficienta");

    }
    public static void Ex6(String string){
        String[] stringArray = string.split("\\.");
        for(int i=0; i< stringArray.length; i++)
            System.out.println(stringArray[i]);
    }



}
