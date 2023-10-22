package Udemy.ExceptionVeJavaIslemleri;

import java.sql.SQLDataException;

public class ThrowsKavrami {
    public static void main(String[] args) {
        try {
            metot3();
            System.out.println("try çalıştı");
        }
        catch (java.lang.Exception e){
            System.out.println(e);
        }
    }


    private static void metot() throws NumberFormatException{
        int a=Integer.parseInt("1f2");
        System.out.println(a);
    }
    private static void metot2() throws NumberFormatException{
      metot();
    }
    private static void metot3() throws NumberFormatException{
      metot2();
    }
}
class A{
    void aMetotu()throws SQLDataException{
        System.out.println("ametotu");
    }
}
class B extends A{
    @Override
    void aMetotu()throws ArrayIndexOutOfBoundsException {
        System.out.println("b class a metotu");
    }
}
class C extends B{
    @Override
    void aMetotu() throws ArrayIndexOutOfBoundsException,NumberFormatException {
        super.aMetotu();
    }
}
