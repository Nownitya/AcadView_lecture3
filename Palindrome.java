
import java.util.Scanner;


public class Palindrome 
{
    public static void main(String[] args)
    {
        int num, remainder, original, temp = 0;
		
        System.out.println("Enter Palindrome Numbers: ");
        Scanner sc = new Scanner(System.in);
        
        num= sc.nextInt();
        
        original = num;
        
        while(num != 0)
        {
            remainder = num%10;
            temp = temp * 10 + remainder;
            num = num/10;
        }
        if(temp==original)
        {
            System.out.print("This is a Palindrome Number");
        }
        else
        {
            System.out.print("This is not a Palindrome Number");
        }
    }
}    
