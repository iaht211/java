public class LopHoc {
    private int classID;
    private String courseName;
    private int day;
    private String slots;
    private String room;
    public LopHoc(int classID, String courseName, int day, String slots, String room) {
        this.classID = classID;
        this.courseName = courseName;
        this.day = day;
        this.slots = slots;
        this.room = room;
    }
    public void setClassID(int classID) {
        this.classID = classID;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setSlots(String slots) {
        this.slots = slots;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getClassID() {
        return classID;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getDay() {
        return day;
    }
    public String getSlots() {
        return slots;
    }
    public String getRoom() {
        return room;
    }
}
