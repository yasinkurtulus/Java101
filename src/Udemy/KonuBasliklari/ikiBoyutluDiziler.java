package Udemy.KonuBasliklari;

public class ikiBoyutluDiziler {
    public static void main(String[] args) {
        //int[][] diziadı=new dizi[satırsayısı][sütunsayısı];
        int[][] ikiboyutludizi=new int[2][3];
        ikiboyutludizi[0][0]=1;
        ikiboyutludizi[0][1]=5;
        ikiboyutludizi[1][0]=3;
        ikiboyutludizi[1][1]=18;
        ikiboyutludizi[1][2]=45;
        int a=5/8;
        System.out.println(a);

        int netborc=0;
        int[][]borcdizisi={{0,100,200}, {350,0,250}, {150,500,0}};
        String[]isimler={"Emre","hasan,","Ali"};
        for (int satır=0;satır<borcdizisi.length;satır++){
            for (int sutun=0;sutun<borcdizisi[satır].length;sutun++){
                netborc=borcdizisi[satır][sutun]-borcdizisi[sutun][satır];
                if (satır!=sutun&&netborc>0)
                System.out.println(isimler[satır]+"'ın "+isimler[sutun]+"'a borcu: "+netborc);
            }

        }

    }
}
