import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
         for (int i=1;i<=n;i++){
            for (int j =0 ;j<n-i;j++){
                System.out.print(" ");
            }

         
             int sp= n-1;
             for (int j=0;j<2*i-1;j++){
            
             
             if(j%2==0){
                     System.out.print(i);
                 }else{
                     System.out.print(" ");
               }

            }
            System.out.println();



        }
    }
}
