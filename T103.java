import java.util.*;
public class T10{
public static void main( String [] args){


System.out.print("Degrees  Radians Sine   Cosine  Tangent");
int degrees = 30;
double radians = Math.toRadians(degrees);
double sin = Math.sin(radians);
double cos = Math.cos(radians);
double tan = Math.tan(radians);

System.out.println();;
System.out.print(degrees + "       ");
System.out.printf("%1.4f\t" , radians);
System.out.printf(" %1.4f\t" , sin);
System.out.printf("%1.4f\t" , cos);
System.out.printf("%1.4f\t" , tan);



degrees = 60;
radians = Math.toRadians(degrees);
sin = Math.sin(radians);
cos = Math.cos(radians);
tan = Math.tan(radians);

System.out.println();
System.out.print(degrees + "       ");
System.out.printf("%1.4f\t" , radians);
System.out.printf(" %1.4f\t" , sin);
System.out.printf("%1.4f\t" , cos);
System.out.printf("%1.4f\t" , tan);

}
}

