// 3. WAP to check whether a person is eligible //for vote or not
import java.util.Scanner;
class vote
{  
   public static void main(String[] args)
  {  
    int age;
    System.out.println("enter the number");
    Scanner sc=new Scanner (System.in);
    age=sc.nextInt();
    if(age>18)
    {  
     System.out.println("eligible for vote");
     }
     else
     { 
      System.out.println("not eligible for vote");
      }
}
}