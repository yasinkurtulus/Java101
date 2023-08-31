package Udemy.Bolum10.hesapmakinesiornek;

public class StaticInnerClass {
    public int degisken=5;
    public static int staticdegisken=10;
    StaticClass a=new StaticClass();

    void metot(){
    }
    static void staticmetot(){
        StaticClass.icstaticdegisken=2;
    }
    static class StaticClass{
        int icdegisken=15;
        static int icstaticdegisken=20;
        void icsinifmetot(){
        staticdegisken=1;
        staticmetot();
        }
        static void staticicsinifmetot(){
            staticmetot();
            icstaticdegisken=1;
            staticdegisken=1;
        }


    }
   class A{

        void asd(){

        }
   }

}
