package AutoTest;

public class Chuoi {
    public static void main(String[] args) {
    //Độ dài của chuỗi
    String greet = "Chào buổi sáng chủ nhật";
    System.out.println(greet.length());

    //Chuyển đổi chuỗi thành chữ HOA hoặc thường
    System.out.println(greet.toUpperCase());
    System.out.println(greet.toLowerCase());

    //Nối chuối
    System.out.println("Lời chào " + greet);
    System.out.println("Lời chào ".concat(greet));
    }
}
