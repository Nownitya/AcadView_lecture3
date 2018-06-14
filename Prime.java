
import java.util.Scanner;

public class Prime 
{
    public static void main(String[] args) 
    {
        int num, i, temp;
        boolean isPrime=true;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
        
        for(i=2; i <= num;i++)
        {
            temp=num%i;            
            if(temp == 0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Given no. is Prime: " +num);
        }
        else
        {
            System.out.println("Given no. is not Prime" +num);
        }
    }
    
}
