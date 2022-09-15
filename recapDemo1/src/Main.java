public class Main {
    public static void main(String[] args) {

        // 1. 4 elemanlı ondalık sayılar dan oluşan myList isimli bir dizi oluştur ve ekrana yazdır.
        // 2. Dizi içindeki elemanların toplamını ekrana yazdır.
        // 3. Dizi içindeki elemanların en büyüğünü ekrana yazdır.

        double[] myList = {1.2, 5.6, 18.8, 0.5};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {

            System.out.println(number);
            total = total + number;

            if (max < number) {
                max = number;
            }
        }

        System.out.println("Toplam = " + total);
        System.out.println("En buyuk sayi=" + max);


    }
}