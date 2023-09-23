package Udemy.bolum12;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>linkedlist=new LinkedList<>();
        ArrayList<Integer>arraylist=new ArrayList<>();
        ListIterator<Integer>iterator=linkedlist.listIterator();
        linkedlisthazirla(linkedlist);
        System.out.println(linkedlist);
        arraylisthazirla(arraylist);
        System.out.println(arraylist);
        System.out.println(linkedlist.get(0));

    }
    public static void arraylisthazirla(ArrayList<Integer> arraylist){
        for (int i=0;i<10;i++){
            int ekleneceksayi=(int) (Math.random()*20);
            siralilisthazirla(arraylist,ekleneceksayi);
        }

    }
    public static void linkedlisthazirla(LinkedList<Integer> linkedList){
        for (int i=0;i<10;i++){
            int ekleneceksayi=(int) (Math.random()*20);
            siralilisthazirla(linkedList,ekleneceksayi);
        }


    }
    public static void siralilisthazirla(List<Integer> list, int gelensayi){
        ListIterator<Integer>iterator=list.listIterator();
        while (iterator.hasNext()){
            int karsilastirma=iterator.next().compareTo(gelensayi);
            if (karsilastirma==0){
                iterator.add(gelensayi);
                return;
                 }

            else if (karsilastirma>0){
                iterator.previous();
                iterator.add(gelensayi);
                return;
            }
        }
        iterator.add(gelensayi);


    }
}
