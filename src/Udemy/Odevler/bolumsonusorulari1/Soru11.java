package Udemy.Odevler.bolumsonusorulari1;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        /*Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0a bastığında girdiği sayıların
           çarpımını sonuç olarak gösteren programı yazınız.*/
        Scanner scanner=new Scanner(System.in);
            int sonuc=1;
        while (true){
            System.out.println("Sayı Giriniz");
            int sayi=scanner.nextInt();
            if (sayi!=0)
            sonuc*=sayi;
            else{
                System.out.println("sonuç: "+sonuc);
                break;
            }

        }
    }
}
