import java.util.Scanner;

public class ReadInput {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input expression (for eg 4*3/2)");
        String inputLine = scanner.nextLine();
        scanner.close();
        return inputLine;

    }

}
