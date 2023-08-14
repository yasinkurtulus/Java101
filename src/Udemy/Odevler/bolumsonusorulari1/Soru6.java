package Udemy.Odevler.bolumsonusorulari1;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayı=scanner.nextInt();
        int sonuc=1;
        for (int i=1;i<=sayı;i++){
            sonuc*=i;
        }
        System.out.println(sonuc);
    }
}
