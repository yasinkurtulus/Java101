package Udemy.Bolum10;

public class YaziciSinif {
    private  int privatedegisken=1;
             int defaultdegisken=2;
    protected int protecteddegisken=3;
    public int publicdegisken=4;
    public static int staticdegisken=5;
    private void privatemetot(){
        diziyazdir nesne =new diziyazdir();
        diziyazdir.innerclass2 nesne1=new diziyazdir().new innerclass2();
        nesne1.innerclass2degiskeni=20;
        System.out.println(nesne.privateinnerdegisken);
    }
    void defaultmetot(){

    }
    protected void protectedmetot(){}




     class diziyazdir{
        private int privateinnerdegisken=1;
                int defaultinnerdegisken=1;
        protected int protectedinnerdegisken=1;
        public int publicinnerdegisken=1;

         void diziyazdir(String[] dizi){
            for (String i:dizi)
                System.out.println(i);
            privatemetot();
            System.out.println(privatedegisken);
        }
        protected void metotlariyazdir(){
            privatemetot();
            defaultmetot();
            protectedmetot();
            staticdegisken=4;
            System.out.println(staticdegisken);
        }
        class innerclass2{
            private int innerclass2degiskeni=10;
        }
    }

}
