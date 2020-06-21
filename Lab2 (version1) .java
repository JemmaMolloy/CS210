import java.util.Scanner;
public class Solution{

    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();

        double thickness = scan.nextDouble();

        double target = scan.nextDouble();


        double current = 0;

        int coins=0;

        while((current*radius)<target){

            coins++;

            current=(current)+(1.0/coins);

        }
        
        double height =coins*thickness;
        
        System.out.println(Math.round(height));

    }

}
