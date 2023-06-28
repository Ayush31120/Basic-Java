public class Square_of_10_natural_number {
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0, sq;
        int n;
        n=1;
        while(n<=10){
            sq = n*n;
            System.out.println(sq);
            sum = sum+sq;
            n = n+1;
        }
        System.out.print("The sum of first Natural Number is: "+sum+" ");
    }
    
}
