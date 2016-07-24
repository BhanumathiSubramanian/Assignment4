import java.util.Scanner;

public class Employee {
	Scanner sc= new Scanner(System.in);
private String name;
private int age;
private int salary;

public int getAge()
{
 return age;	
}

public String getName()
{
 return name;	
}
@SuppressWarnings("unused")
private int getSalary()
{
	return salary;
}

public void getData(String Name, int Age, int Salary)
{ 
	name = Name;
	age = Age;
	salary = Salary;	
}

public void displayData()
{
	System.out.println("Your Name is " + name + " and your Age is " + age);
	System.out.println("Sorry! we Cannot display salary as its hidden");
}

}
