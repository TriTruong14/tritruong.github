package oop;
// tính trừu tượng là định nghĩa một hành vi trong lớp đối tượng chưa hoàn chình
public abstract class BaseUser {
    private String name;
    private int age;

    public BaseUser (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //định nghĩa ra những phương thức trừu tượng (ko có nội dung, yêu cầu lớp định nghĩa)
    public abstract void showMessage();
}
