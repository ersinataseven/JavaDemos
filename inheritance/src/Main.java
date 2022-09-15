public class Main {
    public static void main(String[] args) {


        // Customer ve Employee classlarında oluşan ortak özellikler personal classına yazıldı.
        // extands ile birbirlerine bağlandı
        Customer customer=new Customer();
        Employee employee=new Employee();

        // CustomerManager ve EmployeeManager classlarında buluna ortak özellikler PersonalManager classında yazıldı.
        // extands ile birbirlerine bağlandı.
        CustomerManager customerManager=new CustomerManager();
        EmployeeManager employeeManager=new EmployeeManager();



    }
}