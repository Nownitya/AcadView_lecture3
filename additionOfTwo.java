import java.util.Scanner;
 
class additionOfTwo
{
   public static void main(String args[])
   {
      int a, b, add;
 
      System.out.println("Enter two numbers to calculate their sum");
      Scanner sc = new Scanner(System.in);
 
      a = sc.nextInt();
      b = sc.nextInt();
      add = a + b ;
 
      System.out.println("Sum of the integers = " + add);
   }
}
    

