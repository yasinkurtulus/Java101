package Udemy.UdemyCoursePlayer;

public class Ders {
    private  String dersAdi;
    private  double dersSuresi;
    private  int dersNo;

    public Ders(String dersAdi, double dersSuresi, int dersNo) {
        this.dersAdi = dersAdi;
        this.dersSuresi = dersSuresi;
        this.dersNo = dersNo;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "dersAdi='" + dersAdi + '\'' +
                ", dersSuresi=" + dersSuresi +
                ", dersNo=" + dersNo +
                '}';
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public double getDersSuresi() {
        return dersSuresi;
    }
}
