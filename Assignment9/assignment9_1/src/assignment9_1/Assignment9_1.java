package assignment9_1;

public class Assignment9_1 
{
	static  <T extends Number> T findMin(T [] arr)
	 {
	T min = arr[0] ;
	for(int i = 1 ; i < arr.length ; i++)
	{
	if(arr[i].doubleValue()< min.doubleValue())
	{
	min  = arr[i];

	}
	}
	return min;

	 }
	


public static void main(String[] args)
{
	Integer[] arr1 = { 22, 55, 77, 11, 33 };
	System.out.println("The minimum element of array 1 = "+findMin(arr1));
	Double [] arr2 = {1.1,2.2,3.3,4.4,5.5};
	System.out.println("The minimum element of array 1 = "+findMin(arr2));
	
}
}
