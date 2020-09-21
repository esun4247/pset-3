import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-11s: ", "Fahrenheit");
        double tempF = input.nextDouble();

        double tempC = (tempF-32)*(5.0/9.0);
        double tempK = tempC + 273.15;

        System.out.printf("\n%-11s: %,.2f", "Celsius", tempC);
        System.out.printf("\n%-11s: %,.2f", "Kelvin", tempK);

    }
}
