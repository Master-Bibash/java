public class Output {
    public String getSumDetails(double firstNumber, double secondNumber) {
        Sum sum = new Sum();
        double totalSum = sum.getSum(firstNumber, secondNumber);
        return "The sum of " + firstNumber + " and " + secondNumber + " is " + totalSum;
    }

    public static String getMyName() {
        return " ";}
    public String getDifferenceDetails(double firstNumber, double secondNumber) {
        Difference difference = new Difference();
        double totalDifference = difference.getDifference(firstNumber, secondNumber);
        return "The difference of " + firstNumber + " and " + secondNumber + " is " + totalDifference;
    }

    public String getMultiplyDetails(double firstNumber, double secondNumber) {
        Multiply multiply = new Multiply();
        double totalMultiplication = multiply.getMultiply(firstNumber, secondNumber);
        return "The multiplication of " + firstNumber + " and " + secondNumber + " is " + totalMultiplication;
    }

    }

