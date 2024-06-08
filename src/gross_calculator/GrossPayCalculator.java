package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
//        get the number of hours worked
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//        get the hourly pay rate
        System.out.println("What is your pay rate?");

        double payRate = scanner.nextDouble();
        scanner.close();


//        multiply the hours by the rate
        double grossPay = hours * payRate;

//        display result
        System.out.println("Gross Pay: " + grossPay);

    }
}
