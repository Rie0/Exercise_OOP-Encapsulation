public class Employee {
    private String id;
    private String name;
    private int salary;

    //EXTRA Connected Employees to accounts
    private String accountIBan;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String id, String name, int salary, String accountIBan) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.accountIBan = accountIBan;
    }

    //Getters Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //EXTRA
    public String getAccountIBan() {
        return accountIBan;
    }

    public void setAccountIBan(String accountIBan) {
        this.accountIBan = accountIBan;
    }

    //Methods
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raisedSalary(int percent){
        this.salary+=(this.salary/100)*percent;
        return this.salary;
    }

    public void transferSalary(Account account){
        if (this.accountIBan.equals(account.getIban())){
            account.debit(salary);
        } else {
            System.out.println("There's a problem with IBan number.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
