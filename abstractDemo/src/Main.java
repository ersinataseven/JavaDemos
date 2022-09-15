public class Main {
    public static void main(String[] args) {

        // Sistemimizi farklı veri tabanları ile müşterimiz çalıştığında en az kod değişikliği ile kodlarımızı yazmaya çalıştık
        // Ayrıca yeni bir veri tabanı eklendiğinde sistemimiz çok kolay uyum sağlayabilir.

        CustomerManager customerManager=new CustomerManager();
        customerManager.dataBaseManager=new MySqlDataManager();
        customerManager.getCustomer();





    }
}