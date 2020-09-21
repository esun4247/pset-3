import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-9s: ", "Students");
        int stud = input.nextInt();
        System.out.printf("%-9s: ", "Teachers");
        int teach = input.nextInt();
        System.out.printf("%-9s: ", "Capacity");
        int cap = input.nextInt();
        double totalCount = stud+teach;

        double busCount = totalCount / (double)cap;
        double overflow = (cap*((((totalCount-0.5) % cap) + 0.5) / (double)cap)) + 0.0000000001;

        busCount += ((((cap - (int)overflow) % cap) / (double)cap));
        busCount = (int)(busCount);
        overflow = (int)(overflow);

        System.out.printf("\n%-20s: %d","Buses Required",(int)busCount);
        System.out.printf("\n%-20s: %d","Overflow Passengers",(int)overflow);

    }
}