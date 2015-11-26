package Sort;

public class shell_Sort {

	public static void main(String[] args) {
		int array[]= {1,2,42,35,1,22,24};
		// TODO Auto-generated method stub
		int h = 1;
        while(h <= array.length/3)
        {
            h = h*3 + 1;
        }
        

        while(h>0)
        {
            for(int j = 0; j<array.length;j++)
            {
                for(int k = j; k<array.length;k+=h)
                {
                    if(k+h < array.length && array[k]>array[k+h])
                    {
                        int temp = array[k];
                        array[k] = array[k+h];
                        array[k+h] = temp;

                    }
                }

            }
            h=(h-1)/3;
        }
	
        	for (int x=0;x<array.length;x++){
        		System.out.println(array[x]);
}
}
}
