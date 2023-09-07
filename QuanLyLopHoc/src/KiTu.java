public class KiTu {
    int dau;
    int cuoi;
    public void chuaHoa(String txt) {
        int pos = txt.indexOf("-");
        String tietDau = txt.substring(0, pos);
        String tietCuoi = txt.substring(pos+1);
        dau = Integer.valueOf(tietDau);
        cuoi = Integer.valueOf(tietCuoi);
    }
}
