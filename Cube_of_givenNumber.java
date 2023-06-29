import java.util.Scanner;
public class Cube_of_givenNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number to find its cube: ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int cube = a*a*a;
        System.out.println ("Cube of "+a+" is "+cube);
    }
    
}
