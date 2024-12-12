package java_overview;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diemToan,diemVan,diemAnh,diemLy,diemHoa,diemSinh;
        double hsToan,hsVan,hsAnh,hsLy,hsHoa,hsSinh;

        System.out.print("Nhập điểm toán: ");
        diemToan = scanner.nextDouble();

        System.out.print("Nhập điểm văn: ");
        diemVan = scanner.nextDouble();

        System.out.print("Nhập điểm anh: ");
        diemAnh = scanner.nextDouble();

        System.out.print("Nhập điểm lý: ");
        diemLy = scanner.nextDouble();

        System.out.print("Nhập điểm hóa: ");
        diemHoa = scanner.nextDouble();

        System.out.print("Nhập diểm sinh: ");
        diemSinh = scanner.nextDouble();

        System.out.print("Nhập hệ số toán: ");
        hsToan = scanner.nextDouble();

        System.out.print("Nhập hệ số văn: ");
        hsVan = scanner.nextDouble();

        System.out.print("Nhập hệ số anh: ");
        hsAnh = scanner.nextDouble();

        System.out.print("Nhập hệ số lý: ");
        hsLy = scanner.nextDouble();

        System.out.print("Nhập hệ số hóa: ");
        hsHoa = scanner.nextDouble();

        System.out.print("Nhập hệ số sinh: ");
        hsSinh = scanner.nextDouble();

        double arerageScore = (diemToan * hsToan + diemVan * hsVan + diemAnh * hsAnh + diemLy * hsLy + diemHoa * hsHoa + diemSinh * hsSinh  )/(hsToan + hsVan + hsAnh + hsLy + hsHoa + hsSinh);

        System.out.println("điểm trung bình của bạn là: " + arerageScore);
    }
}
