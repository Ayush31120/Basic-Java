//Printing Series of 10,13.5,17,20.5..... till 10th term
public class DowhileLoop {
    public static void main(String[] args) {
        // TODO code application logic here
        double term =10;
        int count = 0;
        do{
            System.out.println(term);
            count = count+1;
            term = term+3.5;
        }while(count<10);
    }
    
}
