import java.util.Scanner;
public class NumberChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = scn.nextInt();
        if (num>0){
            System.out.println("Your Number is Positive");
        }
        else{
            System.out.println("Your Number in Negetive");
        }
    }
    
}
