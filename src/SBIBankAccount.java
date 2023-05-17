import java.util.UUID;

public class SBIBankAccount implements BankAccount{
    private int balance;
    private String accountNumber;
    private int age;
    private int roi;
    private int minBalance=500;
    public SBIBankAccount(int balance, int age) {
        this.balance = balance;
        this.accountNumber=String.valueOf(UUID.randomUUID());
        this.age = age;
        setRoiBasedOnAge();
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    private void setRoiBasedOnAge() {
        if(age<=18){
            roi=5;
        }else if(age<= 25){
            roi=6;
        }else if(age<=35){
            roi=7;
        }else roi=8;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if((balance-minBalance)>=money){
            this.balance=this.balance-money;
            return true;
        }
        return false;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance+=money;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int timeInYears) {
        return amount * timeInYears * roi / 100;
    }
}
