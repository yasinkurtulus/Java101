package Udemy.ExceptionVeJavaIslemleri;

public class DegerDöndürenIfadelerVeThrow {
    public static void main(String[] args) {
        System.out.println(stringdegerdondurenifade());
        try {
            stringdegerdondurenifade2();
        } catch (java.lang.Exception e) {
            System.out.println("mnain catch");
        }

    }
    private static String stringdegerdondurenifade() {
        ArithmeticException exception=new ArithmeticException();
        String a ="selam";
        try {
            a+=" try";
            throw exception;
        }catch (java.lang.Exception e){
            a+=" cath";
            return a;
        }
        finally {
            return a+=" final";
        }

    }
    private static String stringdegerdondurenifade2() {
        ArithmeticException exception=new ArithmeticException();
        String a ="selam";
        throw exception;

    }
}
