

import java.io.*;
public class prob03 {
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inLine = null;
            
            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
            
            // loop through test cases
            for (int i=0; i<T; i++) {
                // read the line of text
                inLine = br.readLine();
                
                // split on the space
                String[] tokens = inLine.split(" ");
                
                // get the numbers
                int num1 = Integer.parseInt(tokens[0]);
                int num2 = Integer.parseInt(tokens[1]);
                
                // add and multiply
                int sum = num1 + num2;
                int product = num1 * num2;
                
                // print the answers
                System.out.print(sum);
                System.out.print(" ");
                System.out.println(product);
            }
            
            // clean up
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
