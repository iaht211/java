import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyLopHoc quanLyLopHoc = new QuanLyLopHoc();
        int menu;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Bo sung lop hoc");
            System.out.println("2. In thong tin lop hoc");
            System.out.println("3. Tim kiem theo phong hoc");
            System.out.println("4. Sap xep theo ma lop");
            System.out.println("5. Kiem tra trung phong");
            System.out.println("6. Thoat chuong trinh");
            System.out.println("Nhap vao lua chon: ");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    quanLyLopHoc.boSungLop();
                    break;
                case 2:
                    quanLyLopHoc.printClass();
                    break;
                case 3:
                    quanLyLopHoc.timKiemLop();
                    break;
                case 4:
                    quanLyLopHoc.sapXep();
                    break;
                case 5:
                    quanLyLopHoc.kiemTraTrung();
                    break;
            }
        }while(menu!=6);
    }

}