
public class Resort {
	private String Name;
	private int NoOfChildren;
	private int NoOfAdults;
	private int NoOfDays;
	
	Resort(String input){
		String[] str= input.split(":");
		if(str.length!=4) {
			System.out.println("Ïnvalid input");
			return;
		}
		this.Name= str[0];
		this.NoOfChildren=Integer.parseInt(str[1]);
		this.NoOfAdults=Integer.parseInt(str[2]);
		this.NoOfDays=Integer.parseInt(str[3]);
	}

	public  void calc() {
		if(NoOfAdults <=0 || NoOfChildren<=0 || NoOfDays <=0) {
			System.out.println("Invalid input");
			return;
		}
		double total= (NoOfAdults * 1000 + NoOfChildren *650) * NoOfDays;
		System.out.println("customerName : " + Name);
		System.out.println("totalPrice : "+ total);
	}
}
