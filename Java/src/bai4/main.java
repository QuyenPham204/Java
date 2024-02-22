package bai4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      circle circle = new circle();
      HinhChuNhat hcn = new HinhChuNhat();
      int choose;
      Scanner input = new Scanner(System.in);
      do{
        showMenu();
        choose = input.nextInt();
        switch(choose){
            case 1:
                circle.input();
                break;
            case 2:
                System.out.println("Chu vi hinh tron : "+circle.calculateChuvi());
                break;
            case 3:
                System.out.println("Dien tich hinh tron : "+ circle.calculateDientich());
                break;
            case 4:
                hcn.input();
                break;
            case 5:
                System.out.println("Chu vi hinh chu nhat : "+hcn.calculateChuVi());
                break;
            case 6:
                System.out.println("Dien tich hinh chu nhat : "+hcn.calculateDienTich());
                break;
            case 7:
                System.out.println("Thoat");
                break;
            default:
                System.out.println("Nhap sai!!!");
                break;
        }
      }while( choose!=7);
    }
    static void showMenu(){
        System.out.println("1. Nhap thong tin hinh tron");
        System.out.println("2. Tinh chu vi hinh tron");
        System.out.println("3. Tinh dien tich hinh tron");
        System.out.println("4. Nhap thong tin hcn");
        System.out.println("5. Tinh chu vi hcn");
        System.out.println("6. Tinh dien tich hcn");
        System.out.println("7. Thoat");
        System.out.print("Choose : ");
    }
}
