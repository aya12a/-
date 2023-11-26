public class R12 {
    private String cus;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public R12(String cus, String bank, String account, int limit, double balance) {
        this.cus = cus;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public String getCus() {
        return cus;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }
    public void updat(int newLimit) {
        this.limit=newLimit;
    }
    public boolean charge(double price){
        if(price+balance>limit){
            return false;
        }
        balance+=price;
        return true;
    }
    public void mark(double amount){
        if (amount>0){
            balance-=amount;

        }
        else {
            System.out.println("lgnoring request to process");
        }
    }
    public static void main(String[]args){
        R11 card=new R11("JOHN DOE","bank of ABC","123456",100,500);
        System.out.println("credit card limit"+card.getLimit());
        card.updat(1500);
        System.out.println("updated credit card limit"+card.getLimit());
    }
}
