package Udemy.ExceptionVeJavaIslemleri;

public class ExceptionKavrami {
    public static void main(String[] args) {
        try {
            method();
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("burdan devam ediyor");



    }
    public static void method(){
        String [] dizi={"abc",null,"1"};
        int b=0;

        for (int i=0;i< dizi.length+2;i++){
            System.out.println(i);
            try {
                b+=dizi[i].length()+Integer.parseInt(dizi[i]);
            }
            catch (NumberFormatException e) {
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        System.out.println("methodd");
    }
}
