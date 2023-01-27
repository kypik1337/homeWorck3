import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class homeWorck3 {
    public static void main(String[] args) {
        ex2();

    }
    static void ex2(){
        /*
         * Задан целочисленный список ArrayList. Найти минимальное, 
         * максимальное и среднее арифметическое из этого списка. Collections.max()
         */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 10));
            sum += i;
        }
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        sum = sum/2;
        System.out.println(sum);
    }
    static void ex1(){
        /*
         * Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0,10));
        }
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0){
                list2.add(i);
            }
        }
        Collections.sort(list2);
        System.out.println(list2); 
        // Collections.reverse(list2);
        // System.out.println(list2);
    }
}
