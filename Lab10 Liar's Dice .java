
import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;
public class Solution {
    public static void main(String args[] ) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        String roll = scan.nextLine();
        
        int highest =0;
        int amount =0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int number=0;
        int callNo=0;
        int newResult=0;
        int newCounter=0;
        //count occurances of number in string and find largest number
        for(int i =0;i< roll.length();i++)
        {
        if(roll.charAt(i)=='1')
        {
            amount++;
        }
        if(roll.charAt(i)=='2')
        {
            count2++;
        }
        if(roll.charAt(i)=='3')
        {
            count3++;
        }
        if(roll.charAt(i)=='4')
        {
            count4++;
        }
        if(roll.charAt(i)=='5')
        {
            count5++;
        }
        if(roll.charAt(i)=='6')
        {
            count6++;
        }
        if(count2>count3&&count2>count4&&count2>count5&&count2>count6)
        {
            highest = count2;
            number =2;
        }
        if(count3>=count2&&count3>count4&&count3>count5&&count3>count6)
        {
            highest = count3;
            number=3;
        }
        if(count4>=count3&&count4>=count2&&count4>count5&&count4>count6)
        {
            highest = count4;
            number=4;
        }
        if(count5>=count3&&count5>=count4&&count5>=count2&&count5>count6)
        {
            highest = count5;
            number=5;
        }
        if(count6>=count3&&count6>=count4&&count6>=count5&&count6>=count2)
        {
            highest = count6;
            number =6;
        }

        }
        int counter=0;
        
        int current =0;
        int diceNo=1;
        double prob =0;
        int sum = highest +amount;
        int total =(people-1)*5;
        double result =0;
        int array [] = new int [(people-1)*5];
        BigInteger third = BigDecimal.valueOf((double)1/3).toBigInteger();
        BigInteger twothird = BigDecimal.valueOf((double)2/3).toBigInteger();
        
            for(int p = 0; p<=total;p++) //go through all the unknown dice
            {
                BigDecimal tmp = new BigDecimal(nCr(total,p));
                tmp = tmp.multiply(new BigDecimal(Math.pow((double)1/3,p)));
                prob = (tmp.doubleValue())*(double)Math.pow((double)2/3,(total-p));
                result+=prob;
                
                if(result>0.5){
                    current =p;
                    break;
                }
           }
        System.out.println(current+sum+" "+number);
    
    }
  public static BigInteger nCr(long total,long counter)
    {
       
        return ((fact(total)).divide((fact(counter)).multiply(fact(total-counter))));
    }
    public static BigInteger fact(long total)
    {
        BigInteger f = new BigInteger("1");
 
        
        for (int i = 2; i <= total; i++)
            f = f.multiply(BigInteger.valueOf(i));
 
        return f;
    }  
     
    
}
