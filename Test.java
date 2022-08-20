import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to the addition program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Press + to add, - to subtract and * to multiply: ");
        scanner.nextLine();
        String option = scanner.nextLine();

        Output myOutput = new Output();
        Output.getMyName();
        System.out.println(myOutput.getSumDetails(firstNumber, secondNumber));
        String response;
        if (option.contains("+")) {
            response = myOutput.getSumDetails(firstNumber, secondNumber);
        } else if (option.contains("-")) {
            response = myOutput.getDifferenceDetails(firstNumber, secondNumber);
        } else {
            response = myOutput.getMultiplyDetails(firstNumber, secondNumber);
        }

        System.out.println(response);
        scanner.close();
    }
}
