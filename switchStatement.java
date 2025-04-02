import java.util.Scanner;
public class switchStatement 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        //switch(a*b*c)
        switch(a+b+c)
        {
            case 0: System.out.println("answer is zero");
            break;
            case 1: System.out.println("answer is one ");
            break;
            default:System.out.println("answer is not zero/one");
            break;


        }
        


    }

    
}
