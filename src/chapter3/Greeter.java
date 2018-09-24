package chapter3;

public class Greeter {

    String name;
    public Greeter(String userName) {
        name = userName;
    }

    public String sayHello() {
        return "Hello, " + name.trim();
    }

    public String sayGoodbye() {
        return "Goodbye, " + name.trim();
    }

    public String refuseHelp() {
        return "I am sorry, " + name.trim() + ", I am afraid I can't do that.";
    }
}
