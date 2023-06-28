import java.util.Scanner;
public class NumbersAndWeeks {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Week Number between 1 to 7");
        int dow = scn.nextInt();
        switch(dow){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednessday");
            case 5 -> System.out.println("Thrusday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Select Between 1 to 7 Only!!");
        }
    }  
}