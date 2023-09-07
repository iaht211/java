import java.util.LinkedList;
import java.util.Scanner;
import java.lang.String;
public class QuanLyLopHoc {
    LinkedList<LopHoc> lopHoc_list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    public void clear() {
        lopHoc_list.clear();
    }
    public int nhapClassID() {
        System.out.println("Class ID: ");
        return scanner.nextInt();
    }
    public String nhapCourseName() {
        System.out.println("Course name: ");
        return scanner.nextLine();
    }
    public int nhapDay() {
        int day;
        do {
            System.out.println("Day: ");
            day = scanner.nextInt();
        }while((day<2)||(day>7));
        return day;
    }
    public String nhapSlots() {
        String slots;

        do {
            System.out.println("Slots");
            slots = scanner.nextLine();
        }while(slots.length()>10);
        return slots;
    }
    public String nhapRoom() {
        System.out.println("Room: ");
        return scanner.nextLine();
    }
    //ham bo sung hop hoc
    public void boSungLop() {
        int soLop;
        System.out.println("Nhap vao so lop: ");
        soLop = scanner.nextInt();
        for (int i=0;i<soLop;i++) {
            System.out.println("----CLASS"+ (i+1) +"------");
            int classID = nhapClassID();
            scanner.nextLine();

            String courseName = nhapCourseName();
            String room = nhapRoom();
            int day = nhapDay();
            scanner.nextLine();

            String slots = nhapSlots();

            LopHoc lop = new LopHoc(classID, courseName, day, slots, room);
            lopHoc_list.add(lop);

        }
    }
    //ham in thong tin lop hoc
    public void printClass() {
        System.out.printf("\n%7s%15s\t%7s%5s\t%7s\n","Ma lop", "Ten mon hoc", "Ten phong", "Thu", "Tiet hoc");
        for (int i=0;i<lopHoc_list.size();i++) {
            System.out.printf("%7d%15s\t%7s%7d\t%7s\n",lopHoc_list.get(i).getClassID(),
                    lopHoc_list.get(i).getCourseName(), lopHoc_list.get(i).getRoom(),
                    lopHoc_list.get(i).getDay(), lopHoc_list.get(i).getSlots());
        }
    }
    // ham tim kiem theo phong
    public void timKiemLop() {
        System.out.println("Nhap vao ten phong hoc: ");
        String room = nhapRoom();
        int check = 0;
        for (int i=0;i<lopHoc_list.size();i++) {
            if (lopHoc_list.get(i).getRoom().compareTo(room)==0) {
                check++;
                System.out.printf("%7d%15s\t%7s%7d\t%7s\n",lopHoc_list.get(i).getClassID(),
                        lopHoc_list.get(i).getCourseName(), lopHoc_list.get(i).getRoom(),
                        lopHoc_list.get(i).getDay(), lopHoc_list.get(i).getSlots());
            }
        }
        System.out.println("So lop hoc: "+check);
        if (check==0) {
            System.out.printf("Khong ton tai phong %s\n", room);
        }
    }
    // Sap xep lop theo thu tu tang dan
    public void swap(int i, int j) {

        int classID = lopHoc_list.get(i).getClassID();
        lopHoc_list.get(i).setClassID(lopHoc_list.get(j).getClassID());
        lopHoc_list.get(j).setClassID(classID);

        String courseName = lopHoc_list.get(i).getCourseName();
        lopHoc_list.get(i).setCourseName(lopHoc_list.get(j).getCourseName());
        lopHoc_list.get(j).setCourseName(courseName);

        String room = lopHoc_list.get(i).getRoom();
        lopHoc_list.get(i).setRoom(lopHoc_list.get(j).getRoom());
        lopHoc_list.get(j).setRoom(room);

        int day = lopHoc_list.get(i).getDay();
        lopHoc_list.get(i).setDay(lopHoc_list.get(j).getDay());
        lopHoc_list.get(j).setDay(day);

        String slots = lopHoc_list.get(i).getSlots();
        lopHoc_list.get(i).setSlots(lopHoc_list.get(j).getSlots());
        lopHoc_list.get(j).setSlots(slots);
    }
    //ham sap xep theo ma lop tang dan
    public void sapXep() {
        for (int i=0;i<lopHoc_list.size()-1;i++) {
            for (int j=i+1;j<lopHoc_list.size();j++) {
                if (lopHoc_list.get(i).getClassID()>lopHoc_list.get(j).getClassID()) {
                    swap(i,j);
                }
            }
        }
    }
    // ham xu li ki tu
    public void kiemTraTrung() {
        for (int i=0;i<lopHoc_list.size();i++) {
            boolean check = false;
            for (int j=0;j<lopHoc_list.size();j++) {
                if (j==i) {
                    continue;
                }
                if (lopHoc_list.get(i).getDay()==lopHoc_list.get(j).getDay()
                &&lopHoc_list.get(i).getRoom().compareTo(lopHoc_list.get(j).getRoom())==0) {
                    KiTu kiTu1 = new KiTu();
                    kiTu1.chuaHoa(lopHoc_list.get(i).getSlots());
                    KiTu kiTu2 = new KiTu();
                    kiTu2.chuaHoa(lopHoc_list.get(j).getSlots());
                    if (((kiTu1.dau > kiTu1.dau)&&(kiTu1.dau<kiTu2.cuoi))||((kiTu1.cuoi> kiTu2.dau)&&(kiTu1.cuoi< kiTu2.cuoi))) {
                        check = true;
                    }
                }
            }
            if (check == true) {
                System.out.println(lopHoc_list.get(i).getClassID());
            }
        }
    }
}
