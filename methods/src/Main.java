public class Main {
    public static void main(String[] args) {

        sayiBulmaca();
        // Fonksiyon yazarak kendimi tekrarlamayı engelledim.
        // Java dilinde kodlar main fonksiyonundan başlar ve dallanır.
        // Java da method isimleri camel casing (ilk harf küçük sonraki kelimlerin ilk harfleri büyük) şeklinde yazılır.
    }
   public static void sayiBulmaca(){

        int [] sayilar = {0,1,2,3,4,5,6,7,8,9};
        int aranacak = 15;
        boolean varMi=false; //sayinin mevcut dizinin içinde olmadığını varsaydım.

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi mevcuttur.");
        }else {
            System.out.println("Sayi mevcut değildir.");
        }
    }
}