package anu;

public class Binary {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int value=-1;
		binarysearch(arr,value);
	}

static int binarysearch(int[] arr,int value)
{
	int start=0;
	int end=arr.length-1;
	int mid=(start+end)/2;
	while(arr[mid]!=value) {
		if(value<arr[mid])
		{
			end=mid-1;
		}
		else
		{
			start=mid+1;
		}
	}
		if(arr[mid]==value) {
			System.out.println("the value is present"+mid);
			return mid;
		}
		else
		{
			System.out.println("the value is not present");
			return-1;
		}
	}
}


	
		
			
