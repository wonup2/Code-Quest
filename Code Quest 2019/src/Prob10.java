import java.util.*;

public class Prob10 {
    static String file = "Prob10";
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int testCases = Integer.parseInt(input.nextLine());

			for (int testcase = 0; testcase < testCases; testcase++) {
				int shift = Integer.parseInt(input.nextLine());
				String ciphertext = input.nextLine();
				String plaintext = "";
				
				for(int i = 0; i < ciphertext.length(); i++) {
					char cipherLetter = ciphertext.charAt(i);
					
					if(cipherLetter == ' ') {
						plaintext += " ";
						continue;
					}
					
					int value = ALPHABET.indexOf(cipherLetter);
					value -= shift;
					
					if(value < 0) {
						value += 26;
					}
					else if(value >= 26) {
						value -= 26;
					}
					
					plaintext += ALPHABET.charAt(value);
				}
				
				System.out.println(plaintext);
			}
		}
	}
}