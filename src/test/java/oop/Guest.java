package oop;
//tính đa hình: khả năng của 1 đối tượng
public class Guest extends User {
    private String email;

    public Guest (String name, int age, String soDT, String email) {
        super(name, age, soDT);
        this.email = email;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    @Override
    public void welcomeMessage() {
        super.welcomeMessage();
    }
}