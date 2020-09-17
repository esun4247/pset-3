import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("%-7s: ","Height");
        double height = input.nextDouble();
        System.out.printf("%-7s: ","Width");
        double width = input.nextDouble();
        double area = width*height*25.4*25.4;
        System.out.printf("\n%,.2f square millimeters.",area);
    }
}
