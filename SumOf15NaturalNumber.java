public class SumOf15NaturalNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0, x;
        for(x=1; x<=15; ++x){
            System.out.print(x+" ");
            sum=sum+x;
        }
        System.out.println("Sum Of First Natural Number is "+sum);
    }
    
}
