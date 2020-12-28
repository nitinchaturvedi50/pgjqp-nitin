import java.util.Scanner;
class For_users
{  public static void main(String[] args)
   { int  num,tab;
     System.out.println("enter the number");
     Scanner sc=new Scanner(System.in);
     num=sc.nextInt();
     for(int i=1;i<10;i++)
     {tab=num*i; 
       System.out.println(tab+"="+num+"*"+i);
}
}
}