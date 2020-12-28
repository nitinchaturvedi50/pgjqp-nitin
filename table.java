//5. WAP to display the table of any number.
import java.util.Scanner;
class table
{  public static void main(String[] args)
  {  int num,i=1,tab;
     System.out.println("enter the number");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
     while(i<10)
    {  tab=num*i;
       i++;
     System.out.println(tab+"="+num+"*"+i);
     // System.out.println(tab=num*i);

}
}
}
//0/p:2,3,4,5
//system.out.println(tab=+(num*i));