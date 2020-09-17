import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-7s: ","Height");
        double height = input.nextDouble();
        System.out.printf("%-7s: ","Width");
        double width = input.nextDouble();
        double perimeter = ((height * 2) + (width * 2))*2.54;
        System.out.printf("\n%,.2f centimeters.",perimeter);
    }
}
