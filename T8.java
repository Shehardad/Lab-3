import java.util.Scanner;
public class T8{
public static void main( String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number between 0 and 1000:");
int n = sc.nextInt(); 
int n1 = n / 100;
n = n % 100;
int n2 = n / 10;
int n3 = n % 10; 
int sum = n1 + n2 + n3;
System.out.print("The sum is " + sum);

}
}


