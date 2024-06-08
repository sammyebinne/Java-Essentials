package gross_calculator;

import java.util.Scanner;

public class PrintStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        season of the year
        System.out.println("What season of the year are you currently in?");
        String season = scanner.next();

//        whole number (Integer)
        System.out.println("What is the temperature now?");
        int temperature = scanner.nextInt();

//        Adjective
        System.out.println("Describe how you feel right now in one word");
        String adjective = scanner.next();

        scanner.close();


//        Story to print out
        String story = String.format("It is %d oC on a(n) %s day, and it is %s", temperature, season, adjective);

        System.out.println(story);

    }
}
