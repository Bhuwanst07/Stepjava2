import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String text = in.nextLine();

        int l = text.length();
        boolean found = false;

        for (int i = 0; i < l; i++) {
            int c = 0;

            for (int j = 0; j < l; j++) {
                if (i != j && text.charAt(i) == text.charAt(j)) {
                    c++;
                    break;
                }
            }

            if (c == 0) {
                System.out.println("First non-repeating character is: " + text.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}