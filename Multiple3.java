import java.util.Scanner;
class Multiple3
{  public static void main(String[] args)
   {  int size,i;
    //  Scanner sc=new Scanner(System.in);
    // System.out.println("enter the size in //array");
      //size=sc.nextInt();
    // int arr[]=new int [size];
     System.out.println("enter the size in array");
     Scanner sc=new Scanner(System.in);
      size=sc.nextInt();
      int arr[]=new int [size];
     for(i=0;i<size;i++)
     {  arr[i]=sc.nextInt();
      }
      for(i=0;i<size;i++)
     {  System.out.println(arr[i]*2);
      }
}
}