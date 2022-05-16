import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int matematik, fizik, kimya, türkce, tarih, müzik;

        System.out.print("Matematik Notunuzu Giriniz:");
        matematik = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz:");
        türkce = inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz:");
        müzik = inp.nextInt();
        int notToplamlari = (matematik+fizik+kimya+türkce+tarih+müzik);
        double notOrtalamasi = (notToplamlari/6.0);
        System.out.print("Not Ortalamanız:");
        System.out.print(notOrtalamasi);
        double gecmeDeğeri = 60.0;
        boolean gecmeDurumu = (notOrtalamasi)>=(gecmeDeğeri);
        String str = (gecmeDurumu) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);




    }

}
