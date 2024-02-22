import java.util.Scanner;

public class tong2so {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=scan.nextInt();
        System.out.print("Nhap b: ");
        b= scan.nextInt();
        System.out.println("Tong 2 so vua nhap la: "+ (a+b));
    }
}
