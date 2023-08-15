package Udemy.Odevler.Odevler_dizisoruları;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        /*Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
        Ekok(s1,s2) * ebob(s1,s2) = (s1*s2); buna uygun olacak şekilde
        bulunuz*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int sayi1=scanner.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int sayi2=scanner.nextInt();
        int ebob=1;
        for (int i=1;i<=sayi1||i<sayi2;i++){
            if (sayi1%i==0&&sayi2%i==0)
                ebob=i;
        }
        int ekok=(sayi1*sayi2)/ebob;
        System.out.println(ekok);


    }

}
