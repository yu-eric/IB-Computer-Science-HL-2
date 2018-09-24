package chapter3;

public class GreeterTester {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Eric");
        greeter.sayHello();
        greeter.sayGoodbye();
        greeter.refuseHelp();
    }
}
