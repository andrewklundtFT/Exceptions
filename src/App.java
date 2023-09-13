import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); 
        boolean runnin = true;
        String input;
        int inputAsInt;
        while (runnin) {
            System.out.println("gimme integer");
            input = scan.nextLine();
            if (input.equals("exit")) {
                runnin = false;
                break;
            }
            try {
                inputAsInt = Integer.parseInt(input);
                displayFactors(inputAsInt);
            } catch (Exception e)
            {
                System.out.println("only put the digit");
            }
            System.out.println("");
        }
    }

    public static void displayFactors (int x) {
        System.out.println("factors: \n");
        System.out.print(1);
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(", " + i);
            }
        }
    }
}
