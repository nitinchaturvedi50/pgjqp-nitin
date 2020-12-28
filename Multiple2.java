//1. WAP to display all the arrays values //multiple of 2.
import java.util.Scanner;
class Multiple2
{  public static void main(String[] args)
   {  int size,i;
     int arr[]=new int [size];
     System.out.println("enter the size in array");
     Scanner sc=new Scanner(System.in);
      size=sc.nextInt();
      //arr[i]=sc.nextInt();
     for(i=0;i<size;i++)
     {  arr[i]=sc.nextInt();
      }
      for(i=0;i<size;i++)
     {  System.out.println(arr[i]);
      }
}
}