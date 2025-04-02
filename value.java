import java.util.Scanner;
public class value
{
    public static void main(String[] args)
    {
        int a ;
        System.out.print("Enter the value: ");
        Scanner s = new Scanner (System.in);
        a = s.nextInt();
        System.out.println("Entered value is :" + a);
        s.close();

        
    }
}

