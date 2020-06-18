import java.util.*;

public class Solution 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int total = 0;
        for(int i=line.length()-1;i>=0;i--)
        {
            int number = Integer.parseInt(""+line.charAt(i));
            if((line.length()-1-i)%2==1)
            {
                number = number*2;
                if(number>9)
                {
                    number = number-9;
                }
            }
            total=total+number;
        }
        if(total%10==0)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
