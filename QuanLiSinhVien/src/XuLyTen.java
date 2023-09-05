public class XuLyTen {
    public String chuanHoa(String name) {
        name.trim();
        while(name.indexOf(" ")!=-1){
            name.replaceAll(" ", " ");
        }
        return name;
    }
    public String tachHoTen(String name) {
        name = chuanHoa(name);
        if (!name.contains(" ")) {
            return name;
        }
        int pos = name.lastIndexOf(" ");
        String lastName =  name.substring(pos+1);
        String familyName = name.substring(0,pos);
        return lastName;
    }
    //ham so sanh ten
    public int soSanhTen(String name1, String name2) {
        String n1 = tachHoTen(name1);
        String n2 = tachHoTen(name2);
        return n1.compareTo(n2);
    }
    //ham so sanh 2 fullname

}
