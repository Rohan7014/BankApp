public class Main {
    public static void main(String[] args) {
        HDFCBankAccount obj1=new HDFCBankAccount(5000,7);
        obj1.addMoney(1000);
        obj1.checkBalance();
        obj1.getAccountNumber();
        SBIBankAccount sbi1=new SBIBankAccount(10000,8);
    }
}