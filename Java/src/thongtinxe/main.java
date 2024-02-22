package thongtinxe;

import java.util.Scanner;

public class main {
    static Scanner scan = new Scanner(System.in);
    static void nhapXe(vehicle xe){
        System.out.print("Nhap ma xe: ");
        xe.setMaXe(scan.nextInt());
        scan.nextLine();
        System.out.print("Nhap ten chu xe: ");
        xe.setChuXe(scan.nextLine());
        System.out.print("Nhap dung tich xe: ");
        xe.setDungTich(scan.nextInt());
        System.out.print("Nhap tri gia xe:");
        xe.setTriGia(scan.nextDouble());
        scan.nextLine();
        System.out.print("Mo ta: ");
        xe.setMoTa(scan.nextLine());

    }

    public static void main(String[] args) {
         vehicle v[] =null;
         int a,n=0;
         boolean flag = true;
         do{
             System.out.println("1. Tạo các đối tượng xe và nhập thông tin");
             System.out.println("2. Xuất bảng kê khai tiền thuế của các xe");
             System.out.println("Nhập số khác để thoát");
             System.out.print("Lựa chọn của bạn: ");
             a = scan.nextInt();
             switch (a){
                 case 1:
                     System.out.println("Nhập số lượng xe bạn muốn khai báo thế: ");
                     n=scan.nextInt();
                     v = new vehicle[n];
                     for(int i=0;i<n;i++){
                         System.out.println("Xe thứ "+(i+1));
                         v[i] = new vehicle();
                         nhapXe(v[i]);
                     }
                     break;
                 case 2:
                     System.out.printf("%5s %5s %5s %10s %10s %8s \n","Mã xe","Chủ xe","Dung tích","Trị giá","mô tả","Thuế");
                     for (int i = 0; i < n; i++) {
                         v[i].inThue();
                     }
                     break;
                 default:
                     flag=false;
                     break;
             }
         }while (flag);
    }
}
