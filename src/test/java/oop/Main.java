package oop;

public class Main {
    public static void main(String[] args) {
        //tạo ra 1 đối tượng là User
        User user = new User ("Trí", 29, "0905123456");
        user.displayInfo();

        user.setName("Queen");
        user.setAge(18);
        user.displayInfo();

        //tạo ra 1 đối tượng là Admin
        Admin admin = new Admin("Minh", 20, "0913123123", "ADMIN");
        admin.displayAdminInfo();

        Guest guest =  new Guest("Cong", 21, "0935678990", "cong@email.com");
        guest.displayInfo();
        guest.welcomeMessage();

        BaseUser user1= new NormalUser("Truong", 25);
                user1.showMessage();
    }
}