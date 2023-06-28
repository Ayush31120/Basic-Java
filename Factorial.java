import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number For Factorial");
        int num = scn.nextInt();
        int factorial = 1, a;
        for( a=1; a<=num; a++){
            factorial = factorial*a;
        }
        System.out.println("The Factorial of "+num+" is "+factorial);
    }
}
