import java.util.*;

public class string {
    public static float getshortpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir=='n'){
                y++;
            }else if (dir=='s'){
                y--;
            }else if(dir=='e'){
                x++;
            }else{
                x--;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static String toUppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));

            }
        }
        return sb.toString();

    }
    public static String compress(String str){
        
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
                sb.append(str.charAt(i));
                if(count>1){
                    sb.append(count);

                }
            
        }
        return sb.toString();
    }
    public static String compress_S(String str){

        String new_str="";
        //aaabbcc
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            new_str += str.charAt(i);
            if(count>1){
                new_str += count.toString();
            }
        }
        return new_str;

    }
    // public static String o_count(String str){
    //     int count=0;
    //     for(int i=0; i<str.length();i++){
            
    //         char ch= str.charAt(i);
    //         if (ch== 'a' ||ch=='e' || ch=='i'|| ch=='o'||ch=='u'){
    //             count++;

    //         }
    //     } 
    //     System.out.println("the ovel counts are" +count);
    //    //return true;
    // } use this function in main function 
    public static void main(String [] args ){
        // String str= "wneenesennn";
        
        // System.err.println(getshortpath(str));
        // String str="hi, i am kartik ";
        // System.err.println(toUppercase(str));
        String str="aaabbcc";
        System.out.println(compress_S(str));


    }
    
}
