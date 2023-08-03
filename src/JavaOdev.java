public class JavaOdev {
    public static void main(String[] args) {
        //bir ınteger değişkenş oluşturun ve saniye değerini tutun. Bunu dakika ve saniye cinsinden yazdırın
        int zaman=500;
        int dakika=zaman/60;
        double saniye=zaman%60;
        System.out.println(zaman+"saniye = " +dakika+" dakika , "+saniye+" saniye");
        // bir  double değişkeni oluşturun ve bu değişkende fahrenayt cinsinden sıcaklığı saklayın.
        // Sonrasında bu değeri celcius olarak hesaplayın.
         double fahrenheit = 240.8;
         double celcius= (5.0/9)*(fahrenheit-32);
        System.out.println(fahrenheit+"fahreneit = "+celcius+" celcius");
        //Bir yılın artık yıl olup olmadığını hesaplayın
        int yıl=4000;
        if ((yıl%400==0)||((yıl%4==0)&&(yıl%100!=0)))
        {
            System.out.println(yıl+" yılı artık yıldır");
        }
        else
        {
            System.out.println(yıl+" yılı artık yıl değildir");
        }

    }
}
