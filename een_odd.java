//2. WAP to check whether a number is even or //odd.
import java.util.Scanner;
class even_odd
{  
   public static void main(String[] args)
  {  
    int num;
    System.out.println("enter the number");
    Scanner sc=new Scanner (System.in);
    num=sc.nextint();
    if(num%2==0)
    {  
     System.out.println("even")
     }
     else
     { 
      System.out.println("odd")
      }
}
}