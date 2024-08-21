import java.util.*;
public class practice {
    public static boolean  check_positive_ele(int num[]) {
        
        for (int ele : num) {
            if (ele > 0) {
                return true;
            }
        }
        return false;
    }
    


    public static void kadans(int num[]){
        int ms= Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i<num.length;i++){
            cs = cs+num[i];
            if (cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
    System.out.println("max sum is "+ms);
        
    }

    public static void main(String[] args) {
        int num[]={ -2,3,-4,-1,-2,1,5,-3};
       // kadans(num);
        if(check_positive_ele(num)==false ){
            int ms=0;
            for (int i=0;i<num.length;i++){
           
               ms= ms + num[i];
                

        }
        System.out.println("max sum is "+ms);
    }
        else {
          
                
                kadans(num);

            
        }
    

    }
}

