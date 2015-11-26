package Sort;
import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of array to be sorted");
		int i = scan.nextInt();
		
		if (i >12){
			System.out.println("the system cannot have that much input due to complexity");
		}
		else{
			
		
		 
		 System.out.println("Enter input "+i+" times");
		 
		 int array[] = new int[i];
		 //int z = array.length;
		// System.out.println(z);
		 
		 for (int x = 0;x < i ; x++){
			 
			 array[x] = scan.nextInt();
		 }
		 
		 for (int x = 0 ; x < (i-1) ; x++){
			 
			 for(int j = 0 ; j < (i-1) ; j++){
				 
				if ( array[j] > array[j+1] ){
					
					 temp = array[j];
					
					array[j]= array[j+1];
					
					array[j+1]= temp;
				}
				else{}
			 }
		 }
		 for (int x = 0;x<=i-1;x++){
			 System.out.println(array[x]);
		 }

		 
		 
		// TODO Auto-generated method stub
		}
	}

}
