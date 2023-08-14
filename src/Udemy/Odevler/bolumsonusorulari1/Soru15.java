package Udemy.Odevler.bolumsonusorulari1;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Kullanıcıdan aldığınız integer değere kadar olan tüm asal sayıları yazdıran programı yazınız.
        10 için ekranda 2,3,5,7 değerleri olmalıdır*/
        System.out.println("Sayı Giriniz");
        int sayi = scanner.nextInt();
        for (int i = 2; i <= sayi; i++) {
            Boolean asalMi=true;
            for (int a =2; a < i; a++) {
                if (i % a == 0){
                    asalMi=false;
                    break;}
            }

            if (asalMi)
                System.out.println(i+", ");
        }

    }
}
