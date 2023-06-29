import java.util.Scanner;
public class Find_Leap_Year {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Year: ");
        int year = scn.nextInt();
        if (year%100==0){
            if (year%400==0){
                System.out.println(year+" is a century year and leap year");
            }
            else{
                System.out.println(year+" is a century year but not a leap year");
            }
        }
        else{
            if(year%4==0){
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not a leap year");
            }
        }
    }
    
}
