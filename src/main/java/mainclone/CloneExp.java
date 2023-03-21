package mainclone;

import clone.Point;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CloneExp {
    public static void main(String[] args) throws CloneNotSupportedException {
       final Scanner sc = new Scanner(System.in);
        final Logger print = Logger.getLogger("cloneExp");
        print.info(" Enter 1st Points : \n");
        print.info("\n Enter X  : ");
        int x = sc.nextInt();
        print.info("Enter Y : ");
        int y = sc.nextInt();

        Point ob = new Point(x, y);
        Point ob1 = (Point) ob.clone();

        print.info("\nEnter 2nd points: \n");
        print.info("\nEnter X : ");
        int a = sc.nextInt();
        print.info(" Enter Y : ");
        int b = sc.nextInt();

        boolean ans = ob1.equals(a, b);

        print.log(Level.INFO, () ->(" the both points are " + (ans ? "same" : "not same")));



    }
}