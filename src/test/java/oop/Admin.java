package oop;
//tính kế thừa, để Admin kế thừa lại từ User
public class Admin extends User{
    //thuộc tính riêng của Admin
    private String role;

    //constructor de khoi tao
    public Admin (String name, int age, String soDT, String role) {
        super(name, age, soDT); // gọi lại constructor của lớp cha User
        this.role = role;
    }

    //tạo phương thức để lấy giá trị
    public String getRole() {
        return role;
    }

    //tạo phương thức để update giá trị
    public void setRole (String role) {
        this.role = role;
    }

    public void displayAdminInfo() {
        displayInfo(); //kế thừa từ lớp cha (name, age, soDT)
        System.out.println("role: " + role);
    }
}
