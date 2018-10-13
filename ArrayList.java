/**
 * @author Jereemi
 *
 * code to implement ArrayList
 */
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
    //adding the values to the arraylist
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
    //printing the values of the arraylist
		System.out.println("Array contains : " + al);
		
    //adding new values to the arraylist- here the first parameter refers to the index of the arraylist and the second parameter is the value
		al.add(2, 9);
		al.add(5, 9);
		
    //printing the size of the arraylist
		System.out.println(al.size());
		
    //removing the value which is in the 2nd index
		al.remove(2);
    
    //printing the updated arraylist
		System.out.println(al);
    
    //method to remove all the values which is inside the arraylist
		al.removeAll(al);
    
    //printing values from arraylist- empty one
		System.out.println(al);

	}
	
}

output:
Array contains : [1, 2, 3, 4]
6
[1, 2, 3, 4, 9]
[]
