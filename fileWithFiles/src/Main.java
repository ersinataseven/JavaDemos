import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        getFileInfo();

        }

        public static void createFile(){

            File file=new File("C:\\JavaDemos\\files\\student.txt");
            try {
                if (file.createNewFile()) // dosya oluşturulma true false metodu ile çalışır.{
                    System.out.println("Dosya oluşturuldu");
                else {
                    System.out.println("Dosya zaten mevcut"); // dosya yukarıdaki adımlarda zaten oluşturulduğu için
                    // dosya zaten mevcut çıktısını verecek.
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void getFileInfo(){

            File file=new File("C:\\JavaDemos\\files\\student.txt");
            if (file.exists()){
                System.out.println("Dosya adı: "+file.getName());
                System.out.println("Dosya yolu: "+file.getAbsolutePath());
                System.out.println("Dosya okunabilir mi? : "+file.canRead());
                System.out.println("Dosya yazılabilir mi : "+file.canWrite());
                System.out.println("Dosya boyutu: "+file.length());

            }


        }


    }