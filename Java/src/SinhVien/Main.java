package SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          sinhvien sv1 = new sinhvien();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien 1: ");
        sv1.setMasv(scan.nextInt());
        scan.nextLine();
        System.out.print("Nhap ten: ");
        sv1.setHoten(scan.nextLine());
        System.out.print("Nhap Diem LT: ");
        sv1.setDiemLT(scan.nextFloat());
        System.out.print("Nhap Diem TH: ");
        sv1.setDiemTH(scan.nextFloat());

        sinhvien sv2 = new sinhvien();

        System.out.print("Nhap ma sinh vien 2: ");
        sv2.setMasv(scan.nextInt());
        scan.nextLine();
        System.out.print("Nhap ten: ");
        sv2.setHoten(scan.nextLine());
        System.out.print("Nhap Diem LT: ");
        sv2.setDiemLT(scan.nextFloat());
        System.out.print("Nhap Diem TH: ");
        sv2.setDiemTH(scan.nextFloat());

        sinhvien sv3 = new sinhvien();

        System.out.print("Nhap ma sinh vien 3: ");
        sv3.setMasv(scan.nextInt());
        scan.nextLine();
        System.out.print("Nhap ten: ");
        sv3.setHoten(scan.nextLine());
        System.out.print("Nhap Diem LT: ");
        sv3.setDiemLT(scan.nextFloat());
        System.out.print("Nhap Diem TH: ");
        sv3.setDiemTH(scan.nextFloat());

        System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
    }
}
