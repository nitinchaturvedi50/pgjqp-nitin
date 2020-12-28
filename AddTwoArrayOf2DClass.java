import java.util.Scanner;
class AddTwoArrayOf2DClass{
	public static void main(String[] args){
		// Declaration and initialization //of  2D array 
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{7,8,9},{10,11,12}};
                 int size;
		// Instantiation of third array to //store results
      System.out.println("enter the size");
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
                
		int c[][] = new int[size][size];

		for(int i=0; i<size; ++i){
			for(int j=0; j<size; ++j){
				// add two array //and result store in third array
				c[i][j] = a[i][j] + b[i][j];
				System.out.println("Enter sum of "+i + " " + j +"index" +" " + c[i][j]);
			}
		}
	}
}