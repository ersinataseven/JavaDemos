public class Main {
    public static void main(String[] args) {

        String ogrenci1="ahmet";
        String ogrenci2="mehmet";
        String ogrenci3="ali";
        String ogrenci4="veli";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");

        String[] ogrenciler = new String[4]; // ogrenciler diye 4 elemanlı bir dizi tanımladık. Dizlerde indeksler 0 ile başlar.
        ogrenciler[0]="ahmet";
        ogrenciler[1]="mehmet";
        ogrenciler[2]="ali";
        ogrenciler[3]="veli";

        for (int i=0;i<ogrenciler.length;i++){

            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

        //3 farklı metodla dizinin içinde tutulan öğrenci isimlerini ekrana yazdırmaya çalıştım.





    }
}