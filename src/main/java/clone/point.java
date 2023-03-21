package clone;

public class point implements Cloneable {
    int x1, y1;

    point(int x, int y) {
        x1 = x;
        y1 = y;
    }

    public Object clone() throws CloneNotSupportedException

    {
        return super.clone();
    }

    boolean equals(int x, int y) {
        boolean result = ((x1 == x) && (y1 == y)) ? true : false;
        return result;
    }
}