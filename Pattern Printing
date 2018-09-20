/**
 * @author Jereemi
 * 
 * code to implement a printing pattern "|>"
 */
import java.util.Scanner;

public class patternPriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the number of rows: ");
		
		//for accepting the input from the user
		Scanner sc = new Scanner(System.in);
		
		//assigning the accepted value
		a = sc.nextInt();
		
		for(int i=0; i<a; i++){
			//checking if i has reached the half stage
			if(i<a/2){
				for(int j=0; j<=i; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i>=a/2){
				for(int j=a-i; j>0; j--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}

output:

Enter the number of rows: 
5
*
**
***
**
*
