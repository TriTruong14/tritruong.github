package AutoTest;

public class Ham {

    //Hàm ko có giá trị trả về - là hàm thực hiện logic
    static void greeting(){
        System.out.println("hello world");
    }

    //Hàm có giá trị trả về
    static double dtb(double diemToan, double diemLy, double diemHoa){
        double dtb = (diemToan + diemLy + diemHoa)/3;
        return dtb;
    }
    public static void main(String[] args) {
        greeting();

        double diemToan = 7;
        double diemLy = 8;
        double diemHoa = 9;
        double dtb = dtb(diemToan, diemLy, diemHoa);
        System.out.println(dtb);
    }


}