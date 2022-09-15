public class Main {
    public static void main(String[] args) {


        // 3 satır ve 3 sutundan oluşan içinde 3 farklı bölgenin şehirlerini barından bir dizi oluştur ve bunları ekrana yazdır.

        String[][] city = new String[3][3];

        city[0][0] = "İstanbul";
        city[0][1] = "Bursa";
        city[0][2] = "Kocaeli";
        city[1][0] = "Ankara";
        city[1][1] = "Konya";
        city[1][2] = "Kırşehir";
        city[2][0] = "Amasya";
        city[2][1] = "Samsun";
        city[2][2] = "Trabzon";

        for (int i=0;i<=2;i++){
            System.out.println("-------------------------");
            for (int j=0;j<=2;j++){

                System.out.println(city [i][j]);

            }
        }


    }
}