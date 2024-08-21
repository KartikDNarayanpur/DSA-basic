import java.util.*;
public class Devide_con {

        public static void mergesort(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }
            int mid= si+(ei-si)/2;
            mergesort(arr,si,mid);
            mergesort(arr,mid+1,ei);
            merge(arr,si,mid,ei);

        }
        public static void merge(int arr[],int si,int mid,int ei){
           
            int temp[]=new int[ei-si+1]; //6-0+1=7 size for the new temp array
            int i=si;//for the left index
            int j=mid+1;// index for the right array
            int k=0;//for the temp  array index
            while(i<=mid && j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }else{
                    temp[k]=arr[j];
                    j++;

                }
                k++;
            }
            while(i<=mid){
                temp[k++]=arr[i++];
            }
            while(j<=ei){
                temp[k++]=arr[j++];
            }
            for(k=0,i=si;k<temp.length;k++,i++){

                arr[i]=temp[k];
            }

        }
        public static void printa(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");

            }
            System.out.println();
        }
        //Search rotated sorted array 
        public static int rotated(int arr[],int tar,int si,int ei){
            if(si>ei){
                return -1;
            }
            int mid=si+(ei-si)/2;
            //case found
            if (arr[mid]==tar) {
                return mid;
            }
            //case1: mid on L1 
            if(arr[si]<=arr[mid]){
                //case A:left
                if(arr[si]<=tar && tar<=arr[mid]){
                    return rotated(arr,tar,si,mid-1);
                }
                //case B:right
                else{
                    return rotated(arr,tar,mid+1,ei);

                }

            }
            //case 2 : mid on l2
            else{
                //case C: right
                if (arr[mid]>=tar && tar<=arr[ei]){

                    return rotated(arr,tar,mid+1,ei);
                }
                //case D:left
                else{
                    return rotated(arr,tar,si,mid-1);
                }
            }
        }
    
    public static void main(String []args){
        // int arr[] = {2,9,5,4,1,3,6};
        // mergesort(arr,0,arr.length-1);
        // printa(arr);
        int arr[] = {4,5,6,7,0,1,2};
        int tar=0;
       
        System.out.println (rotated(arr,tar,0,arr.length-1));
    }
}
