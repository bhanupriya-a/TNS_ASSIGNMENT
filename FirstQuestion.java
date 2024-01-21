import java.util.Scanner;

public class FirstQuestion {
	public static void main(String[] args) {
		Person p= new Person();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name= sc.nextLine();
		p.setName(name);
		System.out.println("Enter source");
		String source= sc.next();
		p.setSource(source);
		System.out.println("Enter destination");
		String dest= sc.next();
		p.setDest(dest);
		
		System.out.println("Dear" + p.getName() + " , Welcome onboard with service from " + p.getSource() + " " + "to" + " " + p.getDest() + ".Thank you for choosing sky airlines. Enjoy your flight");
		
	}
}
class Person{
	String name, source, dest;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setSource(String source) {
		this.source=source;
	}
	public void setDest(String dest) {
		this.dest=dest;
	}
	
	public String getName() {
		return name;
	}
	public String getSource() {
		return source;
	}
	public String getDest() {
		return dest;
	}
	
}

