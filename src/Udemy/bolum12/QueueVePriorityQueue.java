package Udemy.bolum12;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueVePriorityQueue {
    public static void main(String[] args) {
        Queue<String> kuyruk=new LinkedList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        kuyruk.offer("yaso");//sonuna eleman ekler;
        kuyruk.offer("taso");
        kuyruk.offer("maso");
        kuyruk.offer("bilal");
        System.out.println(kuyruk.peek());//en baştaki elemanı görüntüler eleman yoksa null döndürür
        kuyruk.poll();//kuyruğun başındaki lemenaı çıkarır eleman yoksa null değer döndürür;
        linkedList.offer("irem");
        linkedList.offer("ahmet");
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        PriorityQueue<String>priorityQueue=new PriorityQueue<>();

    }
}
