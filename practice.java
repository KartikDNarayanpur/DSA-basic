import java.util.Scanner;
import java.util.Arrays;

public class practice {
    public static boolean check (int ele[] ){
        Arrays.sort(ele);

        for(int i=0;i<ele.length;i++){
            for(int j =i+1;j<ele.length;j++){
            if (ele[i]==ele[j]){
                return true;
            }
        }


        }return false;
       

    }
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number of elements ");
        
        int n = sc.nextInt();
        System.out.println("enter the of elements "); 
        int [] ele = new int[n];
        for(int i=0; i<n;i++){
            ele[i]=sc.nextInt();
        }
        System.out.println(check(ele));
    }
    
}
