package lessons.lesson10;

public class Point1 {
    private int x, y;

  /*  @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Point1))
            return false;
        Point1 p = (Point1) o;
        return this.x == p.x && this.y == p.y;
    }

   */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point1 point1 = (Point1) o;

        if (x != point1.x) return false;
        return y == point1.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
