public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new KobiKrediManager(),new EmekliKrediManager(),new GencKrediManager(),new TarimKrediManager()};

        for (BaseKrediManager krediManager:krediManagers){

            System.out.println(krediManager.hesapla(1000));
        }



    }
}