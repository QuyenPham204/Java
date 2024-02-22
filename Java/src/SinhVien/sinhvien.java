package SinhVien;

public class sinhvien {
    private int masv;
    private String Hoten;
    private float diemLT,diemTH;
    public sinhvien(){
    }
    public sinhvien(int masv,String Hoten,float diemLT,float diemTH){
        this.masv=masv;
        this.Hoten=Hoten;
        this.diemLT=diemLT;
        this.diemTH=diemTH;
    }
    public int getMasv(){
        return masv;
    }
    public void setMasv(int masv){
        this.masv=masv;
    }
    public String getHoten(){
        return Hoten;
    }
    public void setHoten(String Hoten){
        this.Hoten=Hoten;
    }
    public float getDiemLT(){
        return diemLT;
    }
    public void setDiemLT(float diemLT){
        this.diemLT=diemLT;
    }
    public float getDiemTH(){
        return diemTH;
    }
    public void setDiemTH(float diemTH){
        this.diemTH=diemTH;
    }
    public float tinhdiemTB(){
        return (diemTH+diemLT)/2;
    }
    public String toString (){
        return masv + "-" + Hoten + "Diem TB: " +tinhdiemTB();
    }
    public void inSV(){
        System.out.printf("%6d %-18s %12.2f %12.2f %12.2f \n",masv,Hoten,diemLT,diemTH,tinhdiemTB());
    }
}
