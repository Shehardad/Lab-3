import java.util.Scanner;
public class T3{
 public static void main( String [] args){
Scanner sc = new Scanner(System.in);
int s1;
int s2;
int s3;
int desks;
System.out.print("Amount of students in class 1:");
s1 = sc.nextInt();
System.out.print("Amount of students in class 2:");
s2 = sc.nextInt();
System.out.print("Amount of students in class 3:");
s3 = sc.nextInt();
desks = (s1+1)/2 + (s2+1)/2 + (s3+1)/2; 
System.out.println("Minimum amount of desks needed:" + (desks));
}
}

 
   