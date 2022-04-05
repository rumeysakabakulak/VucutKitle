import java.util.Scanner;

public class VücutKitleİndeksi {
    public static void main(String[] args) {

        double indeks , boy , kilo ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        indeks = kilo / (boy * boy) ;

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);



    }
}
