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
                System.out.println("put just the number like a digit like the key on your keyboard like 6 not like six or like 6! or anything else just the number that's all i want");
            }
            System.out.println("");
        }

    }

    public static void displayFactors (int x) {
        System.out.println("farty");
    }
}
