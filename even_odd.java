import java.util.Scanner;

public class even_odd {
    public static boolean isEven (int n){
        if (n%2==0){
            return true;
        }
        return false;

    }
    public static void main(String []args ){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        if(x==0){
            System.out.println("the number is zero");
        }
   else if (isEven(x)) {
        System.out.println("the number is even");
    }else{
        System.out.println("the number is odd");
    }

    if(isEven(10)){
        System.out.println("the function is working Fine");
    }else{
        System.out.println("the function is working wrong");
    }

    }
    
}
