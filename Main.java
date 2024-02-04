import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the detalis as following, customername : noofchildren : no ofadults: noofdays");
		String input= sc.nextLine();
		
		Resort r= new Resort(input);
		r.calc();
	}
}
