import java.util.Scanner;
public class tableUsingWhileLoop 
{
    public static void main(String[] args)
    {
        //int x = 4;
        int x;
        Scanner s=new  Scanner(System.in);
        x=s.nextInt();
        //System.out.println("Enter the table number: "+ x);
        int i = 1;
        while (i<=10)
        {
            System.out.println(x + "*"+i+"="+x*i);
            i++;

        }
    }
}
    

