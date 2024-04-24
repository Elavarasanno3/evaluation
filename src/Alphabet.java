public class Alphabet {
    public static void main(String[] args) {
        char c = 'D';
        pattern(c);
    }
    public static void pattern(char c) {
        int n = c - 'A' + 1;
        char currentChar = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print(currentChar);
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(currentChar);
            }
            currentChar++;
            System.out.println();
        }
        currentChar -= 2;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print(currentChar);
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(currentChar);
            }
            currentChar--;
            System.out.println();
        }
    }
}