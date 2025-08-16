package assignments;

public class Assignment6_Arrays_Datatype_Operators {

	public static void main(String[] args) 
	{
		String[]students_Name= {"Suresh","Mahesh","Naresh"};
		int[]marks= {75,80,82};
		
		int[]newmarks=new int[3];
		newmarks[0]=marks[0]+10;
		newmarks[1]=marks[1]+10;
		newmarks[2]=marks[2]+10;
		
		System.out.println("Updated Marks");
		for(int j=0;j<students_Name.length;j++)
		{
		   for(int i=0;i<newmarks.length;i++)
		{
				
		
	}
		   
		   System.out.println(students_Name[j]+":"+newmarks[j]);
}

		//calculating average marks
		double totalmarks = newmarks[0]+newmarks[1]+newmarks[2];
		System.out.println(totalmarks);
		double avgmarks = totalmarks/newmarks.length;
		System.out.println(avgmarks);
		
}
}