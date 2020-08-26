import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a weekday number ( from 1-7): ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("It's Sunday.");
                break;
            case 2:
                System.out.println("Its Monday.");
            case 3:
                System.out.println("It's Tuesday.");
                break;
            case 4:
                System.out.println("Its Wednesday.");
                break;
            case 5:
                System.out.println("It's Thursday.");
                break;
            case 6:
                System.out.println("Its Friday.");
                break;
            case 7:
                System.out.println("It's Saturday.");
                break;
            default:
                System.out.println("The week has only 7 days genius. Try again :-)");


        }
    }
}
