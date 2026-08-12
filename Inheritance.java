class BankAccount {
    int money;
    String Desc;
    int idsno;

    // Method Overloading
    void deposit(int amt) {
        money = amt;
    }

    void deposit(int amt, String des) {
        money = amt;
        Desc = des;
    }

    void deposit(int amt, String dec, int idno) {
        money = amt;
        Desc = dec;
        idsno = idno;
    }
}

// Child class
class savings extends BankAccount {
    // Method Overriding
    void interest_calculation() {
        System.out.println("Interest calculation for savings account: " + money * 1.06);
    }
}

// Child class
class current extends BankAccount {
    // Method Overriding
    void interest_calculation() {
        System.out.println("Interest calculation for current account: " + money * 1.02);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        savings s = new savings();
        s.deposit(10000);
        s.interest_calculation();

        current c = new current();
        c.deposit(10000, "Current Account");
        c.interest_calculation();
    }
}