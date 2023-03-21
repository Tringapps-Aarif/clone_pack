package clone;

public class Point implements Cloneable {
   private final int x1;
    private final int y1;

   public Point(int x, int y) {
        x1 = x;
        y1 = y;
    }

    public Object clone() throws CloneNotSupportedException

    {
        return super.clone();
    }

   public boolean equals(int x, int y) {
       return (x1 == x) && (y1 == y);
    }
}