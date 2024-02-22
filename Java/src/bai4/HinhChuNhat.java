package bai4;

import java.util.Scanner;

public class HinhChuNhat {
    float width;
    float height;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        width = scan.nextFloat();
        System.out.print("Nhap chieu rong: ");
        height = scan.nextFloat();
    }
    public float calculateDienTich(){
        return height*width;
    }
    public float calculateChuVi(){
       return 2*(width+height);
    }
}
