//Printing sum of series:1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 + 1/19 + 1/22 + 1/25
public class PrintingSumOfSpecificSeries {
    public static void main(String[] args) {
        // TODO code application logic here
        int x ;
        double sum, term;
        sum = 0;
        for(x = 1; x<=25; x+=3){
            term = 1/x;
            System.out.print("1/"+x+"  ");
            sum = sum + term;
        }
        System.out.println("Sum of Following Series  is "+sum);
    }
    
}
