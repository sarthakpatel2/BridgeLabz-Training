import java.util.*;
class Line{
    Double length;
    // UC1:-calculate line length
    Line(double x1,double y1,double x2,double y2) {
        length=Math.hypot(x2-x1,y2-y1);
    }
    // UC2:-equality check
    public boolean equals(Object obj){
        if (!(obj instanceof Line))
            return false;
        Line other = (Line) obj;
        return length.equals(other.length);
    }
    // UC3:-compare two lines
    public int compareTo(Line other){
        return length.compareTo(other.length);
    }
}
public class LineComparison{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // line 1 input
        System.out.println("\nEnter coordinates for Line 1:");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        Line line1=new Line(x1, y1, x2, y2);
        // line 2 input
        System.out.println("\nEnter coordinates for Line 2:");
        double a1=sc.nextDouble();
        double b1=sc.nextDouble();
        double a2=sc.nextDouble();
        double b2=sc.nextDouble();
        Line line2=new Line(a1, b1, a2, b2);
        // display lengths
        System.out.println("\nLength of Line 1: "+line1.length);
        System.out.println("Length of Line 2: "+line2.length);
        // UC2:-equality
        System.out.println(line1.equals(line2) ? "Both lines are Equal": "Both lines are Not Equal");
        // UC3:-comparison
        int result=line1.compareTo(line2);
        if (result==0)
            System.out.println("Line 1 is Equal to Line 2");
        else if (result>0)
            System.out.println("Line 1 is Greater than Line 2");
        else
            System.out.println("Line 1 is Less than Line 2");
    }
}
