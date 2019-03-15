package chapter11;

public class ExceptionalBankAccountTester {

    public static void main(String[] args) {

        ExceptionalBankAccount ebaFail = new ExceptionalBankAccount(-55);

        ExceptionalBankAccount ebaTest = new ExceptionalBankAccount(400);
        ebaTest.deposit(-33);
        ebaTest.withdraw(555);
    }
}
