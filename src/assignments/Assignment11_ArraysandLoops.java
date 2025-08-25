package assignments;

public class Assignment11_ArraysandLoops {

	public static void main(String[] args) 
	{
		
       int[] arr= {12 ,34,11,36,87,98,93};
		
		int largest=-1;
		int secondlargets=-1;
		int thirdlargest=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		
		System.out.println("Largest Number is "+largest);
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>thirdlargest &&(arr[i]!=largest))
				
			{
				secondlargets=arr[i];
			}
		}

		
		System.out.println("Second Largest="+secondlargets);
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>thirdlargest &&(arr[i]!=largest)&&(arr[i]!=secondlargets))
				
			{
				thirdlargest=arr[i];
			}
		}

		System.out.println("Third Largest "+thirdlargest);

	}

}
