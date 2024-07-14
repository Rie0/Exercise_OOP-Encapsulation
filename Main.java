import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {

 //ACCOUNT-----------------------------------------------------------------------
        Account account1 = new Account("1A","Amal",15000);
        Account account2 = new Account("3A","Maha",2000);
        Account account3 = new Account("4A","Lama");

        System.out.println("Original Balance:");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println();


        System.out.println("Balance after transactions.");
        //Successful cases.
        System.out.println(account1.credit(2000));
        System.out.println(account2.transferTo(account3,1000));
        System.out.println(account3.debit(1000));
        //Unsuccessful cases.
        System.out.println();
        System.out.println(account1.credit(21000));
        System.out.println(account2.transferTo(account3,11000));
        System.out.println();
//EMPLOYEE----------------------------------------------------------------------

        Employee employee1 = new Employee("101","Sarah",12000);
        Employee employee2 = new Employee("102","Noor",15000);
        Employee employee3 = new Employee("103","Shadah",7000);

        System.out.println("Employees:");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println();

        System.out.println("Sarah's Annual Salary");
        System.out.println(employee1.getAnnualSalary());
        System.out.println("Noor's Salary raised by 10 percent");
        System.out.println(employee2.raisedSalary(10));
        System.out.println();

        //EXTRA
        System.out.println("Transfer Salary");
        Employee employeeHuda = new Employee("108","Huda",12000,"SA5600000000");
        Account accountHuda = new Account("Q102","Huda",2000,"SA5600000000");
        System.out.println("Before:");
        System.out.println(accountHuda.getBalance());
        System.out.println("After");
        employeeHuda.transferSalary(accountHuda);
        System.out.println(accountHuda.getBalance());
    }
}