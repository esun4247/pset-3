import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-11s: ","Homework 1");
        double hw1 = input.nextDouble();
        System.out.printf("%-11s: ","Homework 2");
        double hw2 = input.nextDouble();
        System.out.printf("%-11s: ","Homework 3");
        double hw3 = input.nextDouble();
        System.out.printf("%-11s: ","Quiz 1");
        double qz1 = input.nextDouble();
        System.out.printf("%-11s: ","Quiz 2");
        double qz2 = input.nextDouble();
        System.out.printf("%-11s: ","Test 1");
        double ts1 = input.nextDouble();
        double hwAvg = (hw1 + hw2 + hw3)/3;
        double qzAvg = (qz1 + qz2)/2;
        double grade = (hwAvg*0.15) + (qzAvg*0.35) + (ts1*0.5);
        System.out.printf("\n%,.2f",grade);
        System.out.print("%.");
    }
}
