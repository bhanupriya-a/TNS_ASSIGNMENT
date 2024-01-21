import java.util.Scanner;

public class SecondQuestion {
public static void smallestNumber(int a, int b, int c) {
	int smallest = (a<b)? (a<c ? a: c) : (b<c? b:c);
	if(a==b && b==c) {
		System.out.print("All numbers are equal");
	}
	else {
		System.out.print(smallest);
	}
	
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter three numbers");
	int a= sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	smallestNumber(a,b,c);
}
}
