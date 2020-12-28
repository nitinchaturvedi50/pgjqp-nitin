// 7. WAP to check whether a no is +ve,-ve or //zero;
import java.util.Scanner;
class check
{  
   public static void main(String[] args)
  {  
    int num1;
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    num1=sc.nextInt();
    if(num1>0)
    {  
     System.out.println("num1 is positive");
     }
     else if(num1<0)
     { 
      System.out.println("num1 is negative ");
      }
       else
       { 
        System.out.println("num1 is zero");
        }
}
}