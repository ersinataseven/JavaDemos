public class CustomerManager extends Baselogger{

    private Baselogger logger;

    public  CustomerManager(Baselogger logger){

        this.logger=logger;
    }

    public void add(){
        System.out.println("Müşteri Eklendi");
        this.logger.log("Log mesajı");

    }
}
