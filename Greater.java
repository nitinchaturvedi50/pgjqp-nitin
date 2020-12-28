// 4. WAP to check whether a number is greater //than 10 or not
import java.util.Scanner;
class Greater
{  
   public static void main(String[] args)
  {  
    int num;
    System.out.println("enter the number");
    Scanner sc=new Scanner (System.in);
    num=sc.nextInt();
    if(num>10)
    {  
     System.out.println("greater");
     }
     else
     { 
      System.out.println("not greater ");
      }
}
}