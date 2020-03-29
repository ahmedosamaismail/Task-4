/*Ahmed Osama Ismail
 * Sec:1
 * B.N:2
 */
import java.util.*;
public class matriciesmultiplication {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int row1,col1,row2,col2,sum=0;
		System.out.println("Please Enter the first matrix row count : ");
		row1=input.nextInt();
		System.out.println("Please Enter the first matrix column count : ");
		col1=input.nextInt();
		System.out.println("Please Enter the second matrix row count : ");
		row2=input.nextInt();
		System.out.println("Please Enter the second matrix column count : ");
		col2=input.nextInt();
		int [] [] matrix1=new int[row1] [col1];
		int [] [] matrix2=new int[row2] [col2];
		int [] [] matrix3=new int[row1] [col2];
		if(col1!=row2)
		{
			System.out.println("Wrong input please make sure that the columns count at matrix 1 is equal to rows count at matrix 2 ");
			System.exit(0);
		}
		
		for (int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) { 
			 System.out.println("For the first matrix:"+"Please number at row "+ (i+1) + " and column " + (j+1) ); 
			 matrix1[i][j] = input.nextInt();
			 }
			 }
		for (int i = 0; i < row2; i++) {
			for(int j = 0; j < col2; j++) { 
			 System.out.println("For the second matrix:"+"Please number at row "+ (i+1) + " and column " + (j+1) );
			 matrix2[i][j] = input.nextInt();
			 }
			 }
		for (int i = 0; i < row1; i++) {
	        for (int j = 0; j < col2; j++) {
	          for (int k = 0; k < row2; k++)
	          sum = sum+ matrix1[i][k]*matrix2[k][j];
	          matrix3[i][j] = sum;
	          sum = 0;
	        }
	      }
		System.out.println("The matrix is: ");
		for (int i = 0; i < row1; i++) {
			for(int j = 0; j < col2; j++) { 
				System.out.print(matrix3[i][j]+" ");
			 }
			System.out.println();
			 }
		

	}

}























