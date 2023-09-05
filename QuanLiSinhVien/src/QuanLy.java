import java.util.LinkedList;
import java.util.Scanner;

public class QuanLy {
    LinkedList<SinhVien> sinhVien_list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    public void Init() {
        sinhVien_list.clear();
    }
    public String nhapHoTen() {
        System.out.println("Ho&Ten: ");
        return scanner.nextLine();
    }
    public String nhapGioiTinh() {
        System.out.println("Gioi tinh: ");
        return scanner.nextLine();
    }
    public String nhapNgaySinh() {
        System.out.println("Ngay Sinh: ");
        return scanner.nextLine();
    }
    public float nhapGpa() {
        System.out.println("GPA: ");
        return scanner.nextFloat();
    }
    public void themSinhVien() {
        System.out.println("Nhap vao so sinh vien muon them: ");
        int soSV = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<soSV;i++) {
            System.out.println("------Sinh vien "+sinhVien_list.size()+1+"----");
            int maSV= (sinhVien_list.size()>0)?(sinhVien_list.size()+1):1;
            String hoTen = nhapHoTen();
            String gioiTinh = nhapGioiTinh();
            String ngaySinh = nhapNgaySinh();
            float gpa = nhapGpa();
            scanner.nextLine();
            SinhVien sv = new SinhVien(maSV, hoTen, gioiTinh, ngaySinh, gpa);
            sinhVien_list.add(sv);
        }
    }
    //ham in ra so sinh vien
    public void inSinhVien() {
        System.out.println("-------DANH SACH SINH VIEN--------");
        for (int i=0;i<sinhVien_list.size();i++) {
            System.out.println("----Sinh_vien "+sinhVien_list.get(i).getMaSV()+"------");
            System.out.println("Ho&Ten: "+sinhVien_list.get(i).getHoTen()+
                    "\nGioi tinh: "+sinhVien_list.get(i).getGioiTinh()+
                    "\nNgay sinh: "+sinhVien_list.get(i).getNgaySinh()+
                    "\nGPA: "+sinhVien_list.get(i).getGpa());
        }
    }
    //chinh sua thong tin sinh vien
    public void chinhSuaSV() {
        System.out.println("Nhap ma sinh vien can sua : ");
        int maSV = scanner.nextInt();
        scanner.nextLine();
        boolean check = false;
        for (int i=0;i<sinhVien_list.size();i++) {
            if (sinhVien_list.get(i).getMaSV()==maSV) {
                sinhVien_list.get(i).setHoTen(nhapHoTen());
                sinhVien_list.get(i).setGioiTinh(nhapGioiTinh());
                sinhVien_list.get(i).setNgaySinh(nhapNgaySinh());
                sinhVien_list.get(i).setGpa(nhapGpa());
                scanner.nextLine();
            }
        }
    }
    //ham doi cho 2 sinh vien cho nhau
    public void swap(int i, int j) {
        String hoTen = sinhVien_list.get(i).getHoTen();
        sinhVien_list.get(i).setHoTen(sinhVien_list.get(j).getHoTen());
        sinhVien_list.get(j).setHoTen(hoTen);
        String gioiTinh = sinhVien_list.get(i).getGioiTinh();
        sinhVien_list.get(i).setGioiTinh(sinhVien_list.get(j).getGioiTinh());
        sinhVien_list.get(j).setGioiTinh(gioiTinh);
        String ngaySinh = sinhVien_list.get(i).getNgaySinh();
        sinhVien_list.get(i).setNgaySinh(sinhVien_list.get(j).getNgaySinh());
        sinhVien_list.get(j).setNgaySinh(ngaySinh);
        float gpa = sinhVien_list.get(i).getGpa();
        sinhVien_list.get(i).setGpa(sinhVien_list.get(j).getGpa());
        sinhVien_list.get(j).setGpa(gpa);
    }
    //ham sap xep theo gpa
    public void sapXepGpa() {
        for (int i=0;i<sinhVien_list.size()-1;i++) {
            for (int j=i+1;j<sinhVien_list.size();j++) {
                if (sinhVien_list.get(i).getGpa()<sinhVien_list.get(j).getGpa())
                    swap(i,j);
            }
        }
    }
    //sap xep theo ten
    public void sapXepTen() {
        XuLyTen xl = new XuLyTen();
        for (int i=0;i<sinhVien_list.size()-1;i++) {
            for (int j=i+1;j<sinhVien_list.size();j++) {
                int count = xl.soSanhTen(sinhVien_list.get(i).getHoTen(), sinhVien_list.get(j).getHoTen());
                if (count>0) {
                    swap(i, j);
                }
            }
        }
    }
    //tim kiem theo ten
    public void timKiem() {
        XuLyTen xl = new XuLyTen();
        System.out.println("Nhap vao ten can tim: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i=0;i<sinhVien_list.size();i++) {
                if (sinhVien_list.get(i).getHoTen().indexOf(name)==0){
                    check = true;
                    System.out.println("----Sinh_vien "+sinhVien_list.get(i).getMaSV()+"------");
                    System.out.println("Ho&Ten: "+sinhVien_list.get(i).getHoTen()+
                            "\nGioi tinh: "+sinhVien_list.get(i).getGioiTinh()+
                            "\nNgay sinh: "+sinhVien_list.get(i).getNgaySinh()+
                            "\nGPA: "+sinhVien_list.get(i).getGpa());
                }
        }
        if (check==false) {
            System.out.println("khong ton tai sinh vien tren");
        }
    }
}