import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        String line = "";
        Scanner in = new Scanner(System.in);

        while (!line.equals("e")) {
            System.out.print("Number of iterations (\"e\" to exit): ");
            line = in.nextLine();
            if (!line.equals("e")) {
                int n = Integer.parseInt(line);
                System.out.println("\n" + fibonacci(n));
            }
        }
    }

    public static int fibonacci(int n) {
        if (n <= 2) {return 1;}
        else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }
}
