
public class Star_Pattern_mirror {
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 5; i>=1; i--){
            System.out.println();
            for(int j = 1;j<=5;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }    
        }
    }
    
}
