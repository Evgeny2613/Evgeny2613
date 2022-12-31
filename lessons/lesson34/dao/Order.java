package lessons.lesson34.dao;

public class Order {
    private int onum;
    private int amt;
    private String odate;
    private int cnum;
    private int snum;

    public Order(int onum, int amt, String odate, int cnum, int snum) {
        this.onum = onum;
        this.amt = amt;
        this.odate = odate;
        this.cnum = cnum;
        this.snum = snum;
    }

    public int getOnum() {
        return onum;
    }

    public void setOnum(int onum) {
        this.onum = onum;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    @Override
    public String toString() {
        return "O{" +
                "o=" + onum +
                ", a=" + amt +
                ", d='" + odate + '\'' +
                ", c=" + cnum +
                ", s=" + snum +
                '}';
    }
}


