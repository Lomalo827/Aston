package Module1.Ex2;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main (String[] args){

        MyHashSet<String> h = new MyHashSet<>();
        h.add("a");
        h.add("b");
        h.add("b");
        System.out.println("Проверка, что элемент b не добавился: " +h);
        h.add("c");
        h.add("d");
        h.add("e");
        h.add("f");
        h.add("g");
        h.add("h");
        h.add("i");
        h.add("j");
        h.add("k");
        h.add("l");
        h.add("m");
        System.out.println(h);
        System.out.println("Размер HashSet: "+h.size());
        h.remove("a");
        System.out.println("HashSet после удаления элемента a: " + h);


        MyArrayList<Integer> a = new MyArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        System.out.println(a);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(11);
        b.add(12);

        a.addAll(b);
        System.out.println("List после addAll: "+a);

        System.out.println("Получение элемента с индексом 4: "+a.get(4));

        a.remove(10);
        System.out.println("List после удаления элемента с индексом 10: "+a);
    }

}