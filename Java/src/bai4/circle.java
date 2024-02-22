package bai4;

import java.util.Scanner;

public class circle {
    float radius;
    public double getPI(){
        return Math.PI;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        radius = input.nextFloat();
    }
    public float calculateChuvi(){
        return (float) (2*getPI()*radius);
    }
    public float calculateDientich(){
        return (float) (getPI()*Math.pow(radius,2));
    }
}
