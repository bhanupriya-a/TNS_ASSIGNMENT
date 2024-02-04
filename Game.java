import java.util.Scanner;

public class Game {
		    private String sentence;

		    public Game(String sentence) {
		        this.sentence = sentence;
		    }

		    public void processSentence() {
		        if (!isValidInput()) {
		            System.out.println(sentence + " is an invalid input");
		            return;
		        }

		        String sortedSentence = sortLettersAlphabetically();
		        System.out.println("Sorted sentence: " + sortedSentence);
		    }

		    private boolean isValidInput() {
		        // Check if the sentence contains only alphabets and spaces
		        return sentence.matches("[a-z ]+");
		    }

		    private String sortLettersAlphabetically() {
		        // Remove spaces and convert the string to a char array
		        char[] charArray = sentence.replaceAll(" ", "").toCharArray();

		        // Sort the char array
		        java.util.Arrays.sort(charArray);

		        // Convert the sorted char array back to a string
		        return new String(charArray);
		    }
		

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the sentence: ");
		        String inputSentence = scanner.nextLine();

		        Game sentenceProcessor = new Game(inputSentence);
		        sentenceProcessor.processSentence();
		    }
}
		

