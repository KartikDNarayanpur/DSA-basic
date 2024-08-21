
public class Recusive {

    public static void Printdec(int n){
        if (n==1){
            System.out.print("1");
            return;
        }else{
        System.out.print( n+" ");

        Printdec( n-1);
    }
    }
    public static void PrintAce(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }else{
       PrintAce( n-1);
       System.out.print( n+" ");
    }
    }
    public static int Printfact(int n){
        if ( n==0){
            
            return 1;
        }
        int fnm1= Printfact(n-1);
        int fn = n*fnm1;
        return fn;
       

    }
    public static int naturalnumsum(int n){
        if ( n==1){
            
            return 1;
        }
        int snm1= naturalnumsum(n-1);
        int sn = n+snm1;
        return sn;
    }

        public static int fib(int n){
            if ( n==0){
                
                return 0;
            }
            if (n==1){
                return 1;
            }
            int fibnm1= fib(n-1);
            int fibnm2= fib(n-2);
            int fibn =fib(n-1)+fib(n-2);
            return fibn;
           
    
    }
    public static Boolean isSorted(int arr[], int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        
           return isSorted( arr, i+1 );
        
       

}
public static int firstOcuurance(int arr[], int i,int key){
    if (i==arr.length-1){
        return -1;
    }
    if (arr[i]==key){
        return i;
    }
    
       return firstOcuurance( arr, i+1 , key);
    
   

}
public static int lastOcuurance(int arr[], int i,int key){
    if (i==0){
        return -1;
    }
    if (arr[i]==key){
        return i;
    }
    
       return lastOcuurance( arr, i-1 , key);
    
   }
   public static int power(int x, int n){
    if (n==1){
        return x;
    }
    int pow_n = x*power( x,n-1);
    return pow_n;
    
   }
   public static int optimizedpower(int x, int n){
    if(n==0){
        return 1;
    }
    int halfpow= optimizedpower(x,n/2);
   int halfpowsquare = halfpow*halfpow;
   // for odd
   if(n%2!=0){
    halfpowsquare=x*halfpowsquare;
      
   }
    return halfpowsquare;
    
   } 
   public static int tileingways(int n){
    //base case
    if (n==0 || n==1)
    {
        return 1;
    }
    // //fllor 2xn
    // //work
    // //verticle choice
    // int fnm1 = tileingways(n-1);
    // //horizontal choice
    // int fnm2 = tileingways(n-2);
    // return fnm1+fnm2;
    return tileingways(n-1)+tileingways(n-2);

   } 
   public static void removedub(String str, int idx, StringBuilder newstr, boolean map[]){
    if (idx==str.length()){
        System.out.println(newstr);
        return;
    }
    //work
    char curchar = str.charAt(idx);
    if(map[curchar-'a']==true){
        //dublicate
        removedub(str,idx+1,  newstr,  map);

    }else{
        map[curchar-'a']=true;
        removedub(str,idx+1,  newstr.append(curchar),  map);
    }


   }
   public static int friendspair(int n){
    if(n==1||n==2){
        return n;
    }
    //choice
    // //single
    // int fnm1= friendspair(n-1);
    // // pair
    // int fnm2= friendspair(n-2);
    // int pairways= (n-1)*fnm2;
    // //total ways
    // int totalways = fnm1+pairways;
    // return totalways;
    return friendspair(n-1)+(n-1)*friendspair(n-2);

   }
   public static void binString(int n,int lastelement , String str){
    if (n==0){
        System.out.println( str); 
        return ;
    }
    binString(n-1 , 0 , str+"0");
    if(lastelement==0){
        binString(n-1 , 1 , str+"1");
    }

   }
   public static void prob1(int arr[],int idx,int key){
    if(idx==arr.length){
        return ;
    }
    if (arr[idx] == key) {
        System.out.print(idx + " ");
    }
    prob1(arr, idx + 1, key);
}
    
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
   public static void prob2(int num){
    if(num==0){
        return;
    }
    int lastDigit = num%10;
    prob2(num/10);
    System.out.print(digit[lastDigit]+" ");
   }
   public static int length(String str){
    if(str.length()==0){
        return 0;
    }
    return length(str.substring(1))+1;
   }
   public static int countSubstrs(String str, int i, int j, int n) {
    if (n == 1) {
        return 1;
    }
    if (n <= 0) {
        return 0;
    }

    int res = countSubstrs(str, i + 1, j, n - 1) 
            + countSubstrs(str, i, j - 1, n - 1) 
            - countSubstrs(str, i + 1, j - 1, n - 2);

    if (str.charAt(i) == str.charAt(j)) {
        res++;
    }

    return res;
}
public static void towerofHenoi(int n,String src,String helper,String des){
    if (n==1){
        System.err.println("Transfer disk " + n + " from " + src + " destination " + des);
        return;
    }
    towerofHenoi(n-1,src, des,helper);
    System.out.println("Transfer disc " + n + " from " + src + " Destination " + des);
    towerofHenoi(n-1, helper, src, des);

}
    

public static void main (String []args){
    
    // System.out.println( fib(10));
    // System.out.println( fib(11));
    // System.out.println( fib(12));
    // System.out.println( fib(13));
    // int arr[]={1,2,3,4,5};
    
    // System.out.println( isSorted( arr, 0 ));
    //  int arr[]={8,3,6,9,5,10,2,5,3};
    
    
    // System.out.println( firstOcuurance( arr, 0 , 5));
    // System.out.println( firstOcuurance( arr, 0 , 7));
    // int arr[]={8,3,6,9,5,10,2,5,3};
    // System.out.println( lastOcuurance( arr, arr.length-1 , 5));
    // System.out.println(  power(2, 10));
    // System.out.println(  optimizedpower(2, 10));
    // System.out.println(  optimizedpower(2, 9));
   
   // System.out.println( tileingways(10));
//    String str= "apnacollage";
//    removedub(str,0,  new StringBuilder(""),  new boolean[26]);

//System.out.println( friendspair(7));
//binString(5 , 0 ," ");
// int arr[]={3,2,4,5,6,2,7,2,5};
// prob1( arr,0, 5);
//prob2(0);

//System.out.println( length("abcde"));
int n=3;
towerofHenoi(n,"S", "H", "D");

}
}

