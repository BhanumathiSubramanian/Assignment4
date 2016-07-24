import java.util.Scanner;

public class UseBufferExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string value : ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse(); 
		
		System.out.println("Your Letter a reversed:");
		
		System.out.println(sb);
		sc.close();
	}

}
