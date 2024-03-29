package lessons.lesson34.dao;

public class Sales {
    private int snum;
    private String sname;
    private String city;
    private int comm;

    public Sales(int snum, String sname, String city, int comm) {
        this.snum = snum;
        this.sname = sname;
        this.city = city;
        this.comm = comm;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "S{" +
                "s=" + snum +
                ", n='" + sname + '\'' +
                ", c='" + city + '\'' +
                ", r=" + comm +
                '}';
    }
}
