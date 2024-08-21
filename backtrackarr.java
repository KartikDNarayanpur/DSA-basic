public class backtrackarr {
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printarr(arr);
            return ;
        }

        //recursive work
        arr[i]=val;
        changearr( arr,i+1,val+1);
        arr[i]=arr[i]-2;
        

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        System.out.println();

    }
    public static void subset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
                
            }else{
            System.out.println(ans);
           
        } 
        return;
    }
        //yes choice
        subset( str,i+1,ans+str.charAt(i));

        //no choice
        subset( str,i+1,ans);


        
    }
    public static void permutaestr(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            //"abcde" => "ab"+"de" = "abde"
            String newstr=str.substring(0, i)+str.substring(i+1);
            permutaestr(newstr,ans+cur);

        }

    }
    public static void main(String []args){
        // int arr[]= new int[5];
        // changearr( arr,0,1);
        // printarr(arr);
       String str="abc";
        // subset( "abc",0,"");
        permutaestr(str,"");

    }
    
}
