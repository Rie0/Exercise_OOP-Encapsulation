public class Account {
    private String id;
    private String name;
    private int balance = 0;
    //EXTRA
    private String iBan;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //EXTRA
    public Account(String id, String name, int balance, String iBan) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.iBan = iBan;
    }

    //Getters Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    //EXTRA

    public String getIban() {
        return iBan;
    }

    public void setIban(String iBan) {
        this.iBan = iBan;
    }

    //Methods

    public int credit (int amount){
        if (amount>this.balance){
            System.out.println("Insufficient Balance.");
        }else {
            balance-=amount;
        }
        return balance;
    }
    public int debit (int amount){
        return balance+=amount;
    }
    public int transferTo(Account another, int amount){
        if (balance>=amount){
            another.balance+=amount;
            this.balance-=amount;
        }else {
            System.out.println("Transaction failed. Not Enough Balance.");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
