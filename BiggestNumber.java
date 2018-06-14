
import java.util.Scanner;


public class BiggestNumber
{
    public static void main(String[] args) {
        int a, b, c;
		
		
        System.out.println("Enter Three Numbers: ");
        Scanner sc = new Scanner(System.in);
        
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        
        if ( a > b && a > c )
        {
            System.out.println("First no. is Biggest : "+a);
        }
        else if ( b > a && b > c )
        {
            System.out.println("Second no. is Biggest : "+b);
        }
        else if ( c > a && a > b )
        {
            System.out.println("Third no. is Biggest :"+c);
        }
        else
        {
            System.out.println("Number is Distinct");
        }
    }
    
}
