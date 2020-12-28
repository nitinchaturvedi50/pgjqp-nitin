//10. WAP to check whether the entered character //is alphabet or non alphabet
import java.util.Scanner;

public class Alphabets
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}