public class SinhVien {
    private int maSV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private float gpa;
    public SinhVien(int maSV, String hoTen, String gioiTinh, String ngaySinh, Float gpa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public int getMaSV() {
        return maSV;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public Float getGpa() {
        return gpa;
    }
}