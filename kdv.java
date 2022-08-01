import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double tutar,kdv1=0.18,kdv2=0.08;

        System.out.print("ucret giriniz : ");
        tutar=inp.nextDouble();

        double kdvTutar,kdvliTutar;

        if(tutar>0&&tutar<=1000)
        {
            kdvTutar=tutar*kdv1;
            kdvliTutar=tutar+kdvTutar;
            System.out.print("kdv li tutar : "+kdvliTutar);
        }
        if(tutar>1000)
        {
            kdvTutar=tutar*kdv2;
            kdvliTutar=tutar+kdvTutar;
            System.out.print("kdv li tutar : "+kdvliTutar);
        }
    }
}
