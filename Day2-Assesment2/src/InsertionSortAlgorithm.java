
public class InsertionSortAlgorithm
{

	int[] insertionSort(int arr[])
	{
		int temp,ptr;
		for(int i=1; i<arr.length; i++)
		{
			temp=arr[i];
			ptr=i-1;
			while(ptr >= 0 && temp < arr[ptr])
			{
				arr[ptr+1] = arr[ptr];
				ptr -= 1;
			}
			arr[ptr+1]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("INSERTION SORT ALGORITHM TO SORT THE ARRAY ELEMENTS USING FUNCTION");
		int array[] = {87,5,4,3,5,6,44,56,77,87,43,66,543,22};
		InsertionSortAlgorithm obj = new InsertionSortAlgorithm();
		int result[] = obj.insertionSort(array);
		System.out.println("RESULTANT ARRAY");
		for(int element : result)
		{
			System.out.println(element);
		}
	}

}

