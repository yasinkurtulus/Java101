package Udemy.bolum12;

import java.util.LinkedList;
import java.util.Stack;

public class StacSinifi {
    //StackSınıfı vector sınıfından kalıtılmıştır
    public static void main(String[] args) {
        Stack<String>yıgın=new Stack<>();
        LinkedList<String>linkedlist=new LinkedList<>();
        yıgın.add("yaso");
        yıgın.add("yaso");
        //yıgın.add(2,"yamo"); yıgına index kullanrak eleman eklenmez
        yıgın.push("maso");
        yıgın.add("billal");
        yıgın.push("taso");
        yıgın.push("faso");

        System.out.println(yıgın.pop());//en üsttekş elemanu çıkarır
        System.out.println(yıgın.peek());//en üstteki elemanı görüntüler çıkarmaz
        System.out.println(yıgın.search("taso"));
        System.out.println(yıgın.search("yaso"));
        System.out.println(yıgın);
        linkedlist.push("yaso");
        linkedlist.push("taso");
        linkedlist.push("maso");
        linkedlist.push("bilal");
        System.out.println(linkedlist);
        System.out.println(linkedlist.pop());

    }
}
