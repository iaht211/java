import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("--------Nhap vao lua chon-----");
            System.out.println("1. Khoi tao danh sach sinh vien");
            System.out.println("2. Them sinh vien vao danh sach");
            System.out.println("3. Chinh sua thong tin sinh vien");
            System.out.println("4. In ra danh sach sinh vien");
            System.out.println("5. Sap xep theo gpa");
            System.out.println("6. Sap xep theo ten sinh vien");
            System.out.println("7. Tim kiem theo ten");
            System.out.println("0. Thoat");
            System.out.println("Nhap vao lua chon: ");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    quanLy.Init();
                    break;
                case 2:
                    quanLy.themSinhVien();
                    break;
                case 3:
                    quanLy.chinhSuaSV();
                    break;
                case 4:
                    quanLy.inSinhVien();
                    break;
                case 5:
                    quanLy.sapXepGpa();
                    break;
                case 6:
                    quanLy.sapXepTen();
                    break;
                case 7:
                    quanLy.timKiem();
                    break;
            }
        }while(menu!=0);
    }
}