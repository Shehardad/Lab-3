public class T10{
public static void main( String [] args){


System.out.printf("%-10s %-10s %-10s %-10s %-10s" , "Degrees" , "Radians" , "Sine" , "Cosine" , "Tangent");
int degrees = 30;
double radians = Math.toRadians(degrees);
double sin = Math.sin(radians);
double cos = Math.cos(radians);
double tan = Math.tan(radians);

System.out.printf("\n");
System.out.printf("%d\t   ", degrees);
System.out.printf("%-1.4f     " , radians);
System.out.printf("%-1.4f     " , sin);
System.out.printf("%-1.4f     " , cos);
System.out.printf("%-1.4f" , tan);



degrees = 60;
radians = Math.toRadians(degrees);
sin = Math.sin(radians);
cos = Math.cos(radians);
tan = Math.tan(radians);

System.out.printf("\n");
System.out.printf("%d\t   ", degrees);
System.out.printf("%-1.4f     " , radians);
System.out.printf("%-1.4f     " , sin);
System.out.printf("%-1.4f     " , cos);
System.out.printf("%-1.4f" , tan);

}
}

