package Udemy.Bolum11;

import RasyonelSayi.RasyonelSayi;

public class RsTest {
    public static void main(String[] args) {
        RasyonelSayi rs1=new RasyonelSayi(7,5);
        RasyonelSayi rs2=new RasyonelSayi(-5,3);
        RasyonelSayi toplam=rs1.topla(rs2);
        System.out.println(toplam);

    }

}
