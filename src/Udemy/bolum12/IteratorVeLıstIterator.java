package Udemy.bolum12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorVeLıstIterator {
    public static void main(String[] args) {
        ArrayList<Integer>sayilar=new ArrayList<>();
        sayilar.add(0);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);
        sayilar.add(5);
        sayilar.add(10);
        sayilar.add(6);
        ArrayList<Integer>sayilar2=new ArrayList<>();
        sayilar2.add(1);
        sayilar2.add(7);
        sayilar2.add(4);
        sayilar2.add(3);
        sayilar2.add(5);
        sayilar2.add(6);
        //For döngüsü ile sayilar listesinden sayilar2 listesinde olan elemanları çıkarma
      /*  for (int i=0;i<sayilar.size();i++){
            if (sayilar2.contains(sayilar.get(i))) {
                sayilar.remove(i);
                i--;
            }
        }
        System.out.println(sayilar);*/
        //Iterator interfacesi ile bu işlemler daha kolay bir şekilde yapılabilir
        Iterator<Integer>iterator=sayilar.iterator();
     /*   while (iterator.hasNext()){
            if (sayilar2.contains(iterator.next()))
                iterator.remove();
        }*/
        System.out.println(sayilar);
        ListIterator<Integer>listiterator=sayilar.listIterator(sayilar.size());
        while (listiterator.hasPrevious()){
            System.out.println(listiterator.previousIndex()+":"+listiterator.previous());
        }




    }
}
