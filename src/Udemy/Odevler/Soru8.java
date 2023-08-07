package Udemy.Odevler;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
      /*  100lük sistemde verilen notları harfli sistemde gösteren bir uygulama yazınız.Not:Switch kulllanınız */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz: ");
        Double not=scanner.nextDouble();
        int durum=(int)(not/10);
        switch (durum){
            case 9:
                System.out.println("Notunuz: AA");
                break;
            case 8:
                System.out.println("Notunuz: AB");
                break;
            case 7:
                System.out.println("Notunuz: BA");

        }

    }
}
