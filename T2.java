import java.util.Scanner;
public class T2{
 public static void main( String [] args){
Scanner sc = new Scanner(System.in);
   int students;
   int apples;
   int get;
   int basket;
   System.out.print(" Enter the number of students:");
   students = sc.nextInt();
   System.out.print("Enter the number of apples:");
   apples = sc.nextInt();
   get = apples / students;
   basket = apples % students;
   System.out.println("Apples each student got:" + get);
   System.out.println("Basket:" + basket);
}
}