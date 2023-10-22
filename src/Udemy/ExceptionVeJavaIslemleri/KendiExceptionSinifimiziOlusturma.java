package Udemy.ExceptionVeJavaIslemleri;

import java.util.Scanner;

public class KendiExceptionSinifimiziOlusturma {
    public static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        int yas=input.nextInt();
        try {
            if (yas<0){
                throw new YasException("Yaş 0 dan küçük olamaz");
            }
        }catch (YasException e){
            System.out.println(e);
        }
    }
}
class YasException extends Exception {
    String hatamesaji;

    public YasException(String hatamesaji) {
        this.hatamesaji = hatamesaji;
    }

    @Override
    public String toString() {
        return hatamesaji;
    }
}

