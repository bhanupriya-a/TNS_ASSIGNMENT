import java.util.Scanner;

public class ThirdQuestion {
	public static void swap(int a, int b) {
		System.out.println("Before swapping "+ a + " " + b);
		a= a^b;
		b= a^b;
		a= a^b;
		System.out.println("After swapping "+ a + " " + b);
	}

	public static void main(String argd[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		swap(a,b);
	}
}
