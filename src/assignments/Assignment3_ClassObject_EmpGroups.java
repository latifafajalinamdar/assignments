package assignments;

public class Assignment3_ClassObject_EmpGroups extends Assignment3_ClassObject_Employee {

	public static void main(String[] args)
	{
		
		String[] child_employee_Names;
		int[] child_employee_ID;
		
		Assignment3_ClassObject_Employee obj=new Assignment3_ClassObject_EmpGroups();
		
		child_employee_ID=obj.employee_ID;
		child_employee_Names=obj.employee_Names;
		
		System.out.println("Employee Name :"+child_employee_Names[0]+",EMployee Id:"+child_employee_ID[0]);
		System.out.println("Employee Name :"+child_employee_Names[1]+",EMployee Id:"+child_employee_ID[1]);
		System.out.println("Employee Name :"+child_employee_Names[2]+",EMployee Id:"+child_employee_ID[2]);
		
	}

}
