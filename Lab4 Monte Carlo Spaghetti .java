import java.util.*;

public class Spaghetti
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        double nibble=scan.nextInt();
        int count=0;

        for(int i=0;i<10000000;i++)
        {
            double randnum1 = Math.random();
            double randnum2 = Math.random();
    
            double side1 = Math.min(randnum1,randnum2);
            double side2 = Math.max(randnum1,randnum2) - side1;
            double side3 = 1-side2-side1;
    
            double biggest = Math.max(Math.max(side1, side2), Math.max(side2, side3));
    
            double remainder = 1-biggest;
    
            biggest = (biggest*(100.0-nibble))/100;
    
            if(biggest<remainder)
            {
                count++;
            }
        }

        System.out.println(Math.round(((float)count/10000000)*100));
    }
} 
