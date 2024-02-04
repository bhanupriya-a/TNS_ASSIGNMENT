import java.util.Scanner;

public class CheckWord {
	private String sentance;
	
	CheckWord(String sentance){
		this.sentance=sentance;
	}

	public void search(String word) {
		if(sentance.contains(word)) {
			System.out.println("word is present in the sentance");
			
		}
		else
			System.out.println("word is not present");
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter sentance");
		String sentance= sc.nextLine();
		
		System.out.println("enter word");
		String word= sc.next();
		
		CheckWord ch= new CheckWord(sentance);
		ch.search(word);
	}
}
