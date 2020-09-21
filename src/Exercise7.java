import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-8s: ", "Salary");
        double sal = input.nextDouble();
        System.out.printf("%-8s: ", "401k");
        double k = input.nextDouble();
        System.out.printf("%-8s: ", "Federal");
        double fed = input.nextDouble();
        System.out.printf("%-8s: ", "State");
        double state = input.nextDouble();
        double net = (sal * (1 - k/100) * (1-(state+fed)/100))/24;
        System.out.printf("\n$%,.2f.", net);
    }
}
