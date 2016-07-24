import java.util.Scanner;

public class EncapExamp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String MyName;
		int MyAge, MySalary;
		
		System.out.println("Enter your Name : ");
		MyName = sc.next();
		System.out.println("Enter your Age : ");
		MyAge = sc.nextInt();
		System.out.println("Enter your Salary: ");
		MySalary = sc.nextInt();
		Employee e1 = new Employee();
		
		e1.getData(MyName, MyAge, MySalary);
		e1.displayData();
		sc.close();
	}

}
