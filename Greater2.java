// 5. WAP to find the greater of two numbers
import java.util.Scanner;
class Greater2
{  
   public static void main(String[] args)
  {  
    int num1,num2;
    System.out.println("enter the number");
    Scanner sc=new Scanner (System.in);
    num1=sc.nextInt();
    num2=sc.nextInt();
    if(num1>num2)
    {  
     System.out.println("num1 is greater");
     }
     else if(num2>num1)
     { 
      System.out.println("num2 is greater ");
      }
      else
      { 
       System.out.println("break");
       }
}
}