
import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thee number");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int x = Integer.valueOf(input);
            System.out.println(x*x*x);
        }
    }
}
