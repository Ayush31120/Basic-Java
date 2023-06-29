import java.util.Scanner;
public class Use_of_break {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter number a & b");
        int a = scn.nextInt();
        int b = scn.nextInt();
        for(int i = 0; i<5; i++){
            if(b==0){
                break;
            }
            else{
                int c = a/b;
                System.out.println("Quotient = "+c);
            }
        }
        System.out.print("Code is over by break Statement! ");
    }
    
}
