package oop;

public class User {
    //thuoc tinh
    private String name;
    private int age;
    private String soDT;

    //constructor dung de khoi tao nam, age, soDT
    public User (String name, int age, String soDT) {
        this.name = name;
        this.age = age;
        this.soDT = soDT;
    }

    //phương thức
    //getter va setter
    //tao phuong thuc public de lay gia tri
    public String getName () {
        return name;
    }

        public int getAge () {
            return age;
        }

        public String getSoDT () {
            return soDT;
        }

        //tao phuong thuc de update gia tri
        public void setName (String name){
            this.name = name;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public void setSoDT (String SoDT){
            this.soDT = SoDT;
        }

        //tao phuong thuc de hien thi thong tin nguoi dung
        public void displayInfo () {
            System.out.println("Username: " + name + "; Age: " + age + "; ");
        }

        public void welcomeMessage () {
        System.out.println("Welcome " + name + " Thanks for being a user!");
        }
    }
