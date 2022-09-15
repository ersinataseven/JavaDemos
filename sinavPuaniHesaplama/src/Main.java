import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;

        // Scaneer sınıfımızı tanımladık.
        Scanner input=new Scanner(System.in);

        //Kullanıcıdan alınacak notların alalım.

        System.out.print("Matematik notunu giriniz: ");
        matematik=input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik=input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya=input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce=input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih=input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik=input.nextInt();

        //Sınavların ortalama hesabı.
        double ortalama;
        ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print("Ortalama =" +ortalama);


    }
}