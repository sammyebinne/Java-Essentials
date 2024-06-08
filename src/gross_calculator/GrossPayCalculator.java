package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
//        get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

//        get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?");

        payRate = scanner.nextDouble();
        scanner.close();


//        multiply the hours by the rate
        double grossPay = hours * payRate;

//        display result
        System.out.println("Gross Pay: " + grossPay);

    }
}
