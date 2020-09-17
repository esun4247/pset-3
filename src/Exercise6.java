import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s: ","Wage");
        double wage = input.nextDouble();
        System.out.printf("%-10s: ","Monday");
        double mon = input.nextDouble();
        System.out.printf("%-10s: ","Tuesday");
        double tues = input.nextDouble();
        System.out.printf("%-10s: ","Wednesday");
        double wed = input.nextDouble();
        System.out.printf("%-10s: ","Thursday");
        double thurs = input.nextDouble();
        System.out.printf("%-10s: ","Friday");
        double fri = input.nextDouble();
        System.out.printf("%-10s: ","Saturday");
        double sat = input.nextDouble();
        System.out.printf("%-10s: ","Sunday");
        double sun = input.nextDouble();
        double totalWage = wage * (mon+tues+wed+thurs+fri+sat+sun);
        System.out.printf("\n$%,.2f.", totalWage);
    }
}
