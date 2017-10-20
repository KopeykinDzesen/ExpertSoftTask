import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class NewMain {

    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        ArrayList al2 = new ArrayList();

        al1.add(1);
        al1.add(3);
        al1.add(5);

        al2.add(2);
        al2.add(6);
        al2.add(8);

        System.out.println("Входные данные:");
        System.out.println(al1);
        System.out.println(al2);

        merge(al1, al2);

        System.out.println("Результат:");
        System.out.println(al1);
        System.out.println(al2);
    }

    static void merge(ArrayList a, ArrayList b){

        TreeSet ts = new TreeSet();

        ts.addAll(a);
        ts.addAll(b);

        a.clear();
        a.addAll(ts);

    }

}
