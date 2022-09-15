public class Main {
    public static void main(String[] args) {

        KrediIU krediIU=new KrediIU();
        krediIU.KrediHesapla(new CiftciKrediManager());
        krediIU.KrediHesapla(new EmekliKrediManager());
        krediIU.KrediHesapla(new KobiKrediManager());
        krediIU.KrediHesapla(new MemurKredimanager());









    }
}