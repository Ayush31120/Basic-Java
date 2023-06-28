import java.util.Scanner;
public class Factorial_on_while_loop {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to know factorial: ");
        int num = scn.nextInt();
        
        long i, fact = 1;
        i=num;
        while(num!=0){
            fact = fact*num;
            --num;
        }
        System.out.println("The factorial of "+i+" is "+fact);
    }
    
}
