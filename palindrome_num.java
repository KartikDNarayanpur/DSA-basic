import java.util.Scanner;

public class palindrome_num {

    public static int add_num(int n){
        int ans=0;
        int digit;


        while(n!=0){
             digit= n%10;
            ans+=digit;
            n=n/10;

        }
        return ans;
    }
    
    public static void main(String []args ){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(add_num(num));
       /*  int temp =num;
        int rev=0;
        while (temp!=0){
            rev = rev*10;
            rev = rev +(temp%10);
            temp = temp/10;

        }
        




        
    if (rev==num) {
        System.out.println("the number is palindrome ");
    }else{
        System.out.println("the number is not Palindrome");
    }*/

    

    }
}