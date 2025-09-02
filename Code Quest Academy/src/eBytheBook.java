import java.util.Scanner;

public class eBytheBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the number of test cases (use next() to avoid blank-line issues)
        int t = Integer.parseInt(sc.next().trim());

        // Step 2: Loop over all test cases
        for (int tc = 0; tc < t; tc++) {

            // Step 3: Read one ISBN token, uppercase it, and remove non [0-9X] chars (e.g., hyphens)
            String raw = sc.next().trim().toUpperCase();
            String isbn = raw.replaceAll("[^0-9X]", "");

            // Step 4: Basic validation: must be exactly 10 chars after cleanup
            if (isbn.length() != 10) {
                System.out.println("INVALID");
                continue;
            }

            // Step 5: Compute weighted sum of the first 9 digits (weights 10..2)
            int sum = 0;
            boolean bad = false;
            for (int i = 0; i < 9; i++) {
                char ch = isbn.charAt(i);
                if (!Character.isDigit(ch)) {  // first 9 must be digits
                    bad = true;
                    break;
                }
                int digit = ch - '0';
                int weight = 10 - i;
                sum += digit * weight;
            }
            if (bad) {
                System.out.println("INVALID");
                continue;
            }

            // Step 6: Compute the needed check digit so (sum + check) % 11 == 0
            int needed = (11 - (sum % 11)) % 11;   // 0..10
            char expected = (needed == 10) ? 'X' : (char) ('0' + needed);

            // Step 7: Compare with actual last character (may be 'X')
            char actual = isbn.charAt(9);
            if (actual == expected) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }

        sc.close();
    }
}
