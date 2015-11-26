package Sort;

public class insert_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  array[] = {11,2,32,435,224,5};
	        //sorted.setText("");
	        for (int i = 1; i < array.length; i++)
	        {
	            for(int j = i; j>0;j--)
	            {
	                if(array[j]<array[j-1])
	                {
	                    int temp = array[j];
	                    array[j] = array[j-1];
	                    array[j-1] = temp;
	                    
	                }
	            }
	        }
	        for (int i = 1; i < array.length; i++)
	        {
	        System.out.println(array[i]);}
	}

}
