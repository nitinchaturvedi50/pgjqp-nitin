// 6. WAP to find the greater of three numbers
import java.util.Scanner;
class Greater3
{  
   public static void main(String[] args)
  {  
    int num1,num2,num3;
    System.out.println("enter the number");
    Scanner sc=new Scanner (System.in);
    num1=sc.nextInt();
    num2=sc.nextInt();
     num3=sc.nextInt();

    if(num1>num2)
    {  
     System.out.println("num1 is greater");
     }
     else if(num2>num3)
     { 
      System.out.println("num2 is greater ");
      }
      else if(num3>num1	)
      { 
       System.out.println("num3 is greater");
       }
       else
       { 
        System.out.println("break");
        }
}
}