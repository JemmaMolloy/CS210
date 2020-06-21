import java.util.*;

public class Solution 
{
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int lowerbound = 0;
        int upperbound = 0;
        int count = 0;
        boolean value = true;
        
        if (x<y)
        {
            lowerbound = x;
            upperbound = y;
        }
        else
        {
            lowerbound = y;
            upperbound = x;
        }
        
        for(int i =lowerbound; i<=upperbound;i++)
        {

            boolean isprime = true;

            for(int j = 2;j< = Math.sqrt(i); j++)
            {

                if(i%j==0)
                {
                    isprime=false;
                }
            }

            if(isprime)
            {
                count++;
            }

        }
        System.out.println(count);
        
    }
    
}
