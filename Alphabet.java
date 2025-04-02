import java.util.Scanner;
public class Alphabet 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        if (Character.isUpperCase(ch))
        {
            System.out.println(ch + " is the uppercase Letter");
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println(ch + " is the lowercase Letter");
        }
        else
        {
            System.out.println(ch + " is not an alphabet");
        }

    }

    
}
