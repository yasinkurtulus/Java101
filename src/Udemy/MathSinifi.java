package Udemy;

public class MathSinifi {
    public static void main(String[] args) {

        System.out.println("pi sayısı: "+Math.PI);
        System.out.println("Euler sayısı: "+Math.E);
        System.out.println("-10'un mutlak değeri: "+Math.abs(-10));
        System.out.println("5.3'ün yuvarlanmış değeri: "+Math.ceil(5.3));
        System.out.println("-5.3'ün yuvarlanmış değeri: "+Math.ceil(-5.3));
        System.out.println("2'nin kuvveti:"+Math.pow(2,3));
        System.out.println("16'nın karekökü: "+Math.sqrt(16));
        System.out.println("Max min değer bulma "+Math.max(1,8));
        System.out.println("Max min değer bulma "+Math.min(1,8));

        //rastgele sayı üretme
        double random=Math.random();
        System.out.println(random);
        //0'dan 100'a kadar sayı üretme
        int randomsayi=(int)(Math.random()*101);
        System.out.println(randomsayi);

    }

}
