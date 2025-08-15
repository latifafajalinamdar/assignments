package assignments;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) 
	{
		
		//Storing Student1 Data
		Map<String,String>studentMap1=new HashMap<String,String>();
		
		studentMap1.put("Name", "John Doe");
		studentMap1.put("Age", "Twenty");
		studentMap1.put("Gender","Male");
		studentMap1.put("Roll Number", "SBA12345");
		studentMap1.put("Grade", "A++");
		studentMap1.put("Major", "Computer Science");
		studentMap1.put("GPA", "A3.8");
		studentMap1.put("Email", "john@example.com");
		studentMap1.put("PAN Number", "SDF6543210");
		studentMap1.put("Address", "John Doe123 Elm St");
		
		System.out.println(studentMap1);
		
		//Storing Student2 Data
        Map<String,String>studentMap2=new HashMap<String,String>();
		
		studentMap2.put("Name", "Jane Smith");
		studentMap2.put("Age", "Twenty One");
		studentMap2.put("Gender","Female");
		studentMap2.put("Roll Number", "SBA12346");
		studentMap2.put("Grade", "B+");
		studentMap2.put("Major", "Mathematics");
		studentMap2.put("GPA", "A3.8");
		studentMap2.put("Email", "jane@example.com");
		studentMap2.put("PAN Number", "REW6543211");
		studentMap2.put("Address", "456 Oak St");
		
		System.out.println(studentMap2);
		
		//Storing Student3 Data
        Map<String,String>studentMap3=new HashMap<String,String>();
		
		studentMap3.put("Name", "Mike Brown");
		studentMap3.put("Age", "Twenty Two");
		studentMap3.put("Gender","SBA12347");
		studentMap3.put("Roll Number", "SBA12346");
		studentMap3.put("Grade", "A+");
		studentMap3.put("Major", "Physics");
		studentMap3.put("GPA", "A3.9");
		studentMap3.put("Email", "mike@example.com");
		studentMap3.put("PAN Number", "TYR6543212");
		studentMap3.put("Address", "789 Pine St");
		
		System.out.println(studentMap3);
		
		
		//Storing employee1 Details
		
		Map<String,String>emp1data=new HashMap<String,String>();
		
		emp1data.put("Employee ID", "E001");
		emp1data.put("Name", "Alice Green");
		emp1data.put("Age", "Thirty	");
		emp1data.put("Gender", "Female");
		emp1data.put("Department", "Engineering");
		emp1data.put("Position", "Software Engineer");
		emp1data.put("Salary ", "75K Pounds");
		emp1data.put("Email", "alice@example.com");
		emp1data.put("PAN Number", "SDF6543210");
		
		System.out.println(emp1data);
		
		
		
		//Storing employee2 Details
		
				Map<String,String>emp2data=new HashMap<String,String>();
				
				emp2data.put("Employee ID", "E002");
				emp2data.put("Name", "Bob Johnson");
				emp2data.put("Age", "Thirty Five	");
				emp2data.put("Gender", "Male");
				emp2data.put("Department", "Marketing");
				emp2data.put("Position", "Marketing Manager");
				emp2data.put("Salary ", "85K Pounds");
				emp2data.put("Email", "bob@example.com");
				emp2data.put("PAN Number", "REW6543211");
				
				System.out.println(emp2data);
		
				//Storing employee3 Details
				
				Map<String,String>emp3data=new HashMap<String,String>();
				
				emp3data.put("Employee ID", "E003");
				emp3data.put("Name", "Carol White");
				emp3data.put("Age", "Twenty Eight");
				emp3data.put("Gender", "Female");
				emp3data.put("Department", "Sales");
				emp3data.put("Position", "Sales Executive");
				emp3data.put("Salary ", "65K Pounds");
				emp3data.put("Email", "carol@example.com");
				emp3data.put("PAN Number", "TYR6543212");
				
				System.out.println(emp3data);
	
				//Storing Product1 Data
				Map<String,String > Product1Map = new HashMap<String,String>();
				Product1Map.put("Product ID","P001");
				Product1Map.put("Name","Laptop");
				Product1Map.put("Category","Electronics");
				Product1Map.put("Price","$1,200");
				Product1Map.put("Stock Quantity","50");
				Product1Map.put("Supplier","Tech Supplies");
				Product1Map.put("Warranty","2 years");
				Product1Map.put("Rating","4.5");
				Product1Map.put("Manufacturing Date","15-01-2023");
				Product1Map.put("Expiry Date","15-01-2025");
				System.out.println("Product 1 details :"+Product1Map);
				
				//Storing Product2 Data
				
				Map<String,String > Product2Map = new HashMap<String,String>();
				Product2Map.put("Product ID","P002");
				Product2Map.put("Name","Desk Chair");
				Product2Map.put("Category","Furniture");
				Product2Map.put("Price","$150");
				Product2Map.put("Stock Quantity","200");
				Product2Map.put("Supplier","Office Depot");
				Product2Map.put("Warranty","1 year");
				Product2Map.put("Rating","4");
				Product2Map.put("Manufacturing Date","10-02-2023");
				Product2Map.put("Expiry Date","N/A");
				System.out.println("Product 2 details :"+Product2Map);
				
				//Storing Product3 Data
				
				
				Map<String,String > Product3Map = new HashMap<String,String>();
				Product3Map.put("Product ID","P003");
				Product3Map.put("Name","Coffee Maker");
				Product3Map.put("Category","Kitchen");
				Product3Map.put("Price","$75");
				Product3Map.put("Stock Quantity","100");
				Product3Map.put("Supplier","KitchenWorld");
				Product3Map.put("Warranty","6 months");
				Product3Map.put("Rating","4.2");
				Product3Map.put("Manufacturing Date","20-03-2023");
				Product3Map.put("Expiry Date","20-03-2024");
				System.out.println("Product 3 details :"+Product3Map);
				
				//Student1Map,Student2Map,Student3Map details are added under List (studentList)
				
				List<Map<String,String >> studentList = new ArrayList<Map<String,String >>();
				studentList.add(studentMap1);
				studentList.add(studentMap2);
				studentList.add(studentMap3);
				System.out.println("Student List :"+studentList);
				
				//Employee1Map,Employee2Map,Employee3Map details are added under List (empList)
				
				List<Map<String,String >> empList = new ArrayList<Map<String,String >>();
				empList.add(emp1data);
				empList.add(emp2data);
				empList.add(emp3data);
				System.out.println("Employee List :"+empList);
				
				//Product1Map,Product1Map,Product1Map details are added under List (productList)
				
				
				List<Map<String,String >> productList = new ArrayList<Map<String,String >>();
				productList.add(Product1Map);
				productList.add(Product2Map);
				productList.add(Product3Map);
				System.out.println("Product List :"+productList);
				
				
				//To access all data of studentList,empList,productList are mapped under Map(HashMap)
				
				Map<String,List<Map<String,String >>> data = new HashMap<String,List<Map<String,String >>>();
				data.put("StudentData",studentList);
				data.put("EmployeeData",empList);
				data.put("ProductData",productList);
				System.out.println("All Data List :"+data);
				System.out.println("Displaying Supplier Name of 2nd row ProductData: "+data.get("ProductData").get(1).get("Supplier"));
				
				
				 
				
				
	}

}
