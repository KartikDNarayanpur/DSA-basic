public class tapwater {
public static int  tapwater_f(int height[]) {
    int n=height.length;
    int trappedWater=0;
//left max array 
int leftMax []=new int[n];
leftMax[0]=height[0];
for(int i=1;i<n;i++){
    leftMax[i]=Math.max(height[i],leftMax[i-1]);

}

    //right max array
    int rightMax []=new int[n];
rightMax[n-1]=height[n-1];
for(int i=n-2;i>=0;i--){
    rightMax[i]=Math.max(height[i],rightMax[i+1]);

}

    //loop for trapped water
    
    for(int i=0;i<n;i++){
        int water_level =Math.min(leftMax[i],rightMax[i]);

        trappedWater += water_level-height[i];
    
    }
    return trappedWater;



    
}
    
    public static void main(String args[]){
        int height []={4,2,0,6,3,2,5};
        System.out.println(tapwater_f(height));


    }
}