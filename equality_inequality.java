// 8.9. WAP to check the equality of two numbers;
import java.util.Scanner;
class equality_inequality
{  
   public static void main(String[] args)
  {  
    Float num1;
    int num2;
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    num1=sc.nextfloat();
    num2=sc.nextInt();

    if(num1==num2)
    {  
     System.out.println("equal");
     }
     else if(num1!=num2)
     { 
      System.out.println("not equall ");
      }
       else
       { 
        System.out.println(" zero");
        }
}
}