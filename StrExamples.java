import java.util.Scanner;

public class StrExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word - (Don't have spaces): ");
		String name = sc.next();
		char[] ch = name.toCharArray();
		for (int j=name.length()-1;j>=0;j--)
		{
		System.out.print(ch[j]);
		
		}
		sc.close();
		
	}

}
