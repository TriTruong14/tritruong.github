package oop;

public class NormalUser extends BaseUser {
    public NormalUser(String name, int age) {
        super(name, age);
    }

    @Override
    public void showMessage() {
        System.out.println(getName() + " is a normal user");
    }
}
