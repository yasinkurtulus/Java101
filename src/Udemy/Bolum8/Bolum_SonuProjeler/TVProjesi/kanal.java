package Udemy.Bolum8.Bolum_SonuProjeler.TVProjesi;

public class kanal {
    private String isim;
    private int no;

    public kanal(String isim, int no) {
        this.isim = isim;
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    public void bilgilerigoster( ){
        System.out.println("Kanal no:"+getNo()+" isim:"+getIsim());
    }
}
