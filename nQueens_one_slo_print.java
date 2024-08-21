public class nQueens_one_slo_print {
    
    
    public static boolean issafe(char bord[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }

        //left diagonally up

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(bord[i][j]=='Q'){
                return false;
            }
        }

        // right diagoanlly up
        for(int i=row-1,j=col+1;i>=0 && j<bord.length;i--,j++){
            if(bord[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static boolean nqueen(char bord[][],int row){
        //base case
        if ((row==bord.length)) 
        {
            // print(bord); to get solution remove the comment on print 
            count++;

            return true;
        }
//column loop
        for (int j=0;j<bord.length;j++){
            if(issafe(bord,row,j)){
                bord[row][j]='Q';
                if (nqueen(bord,row+1)){//function call
                    return true;

                }
                
                 bord[row][j]='x';//back tracking
               

            }
           
        }
        return false;
    }
    public static void print (char bord [][]){
        System.out.println("----------------Chesss Bord--------------");
        for (int i=0;i<bord.length;i++){
            for (int j=0;j<bord.length;j++){
                 System.out.print(bord[i][j]+" ");
             }
             System.out.println();
        }

    }
    // to count solution 
    static int count;
    public static void main (String []args) {
        int n=5;
        char bord[][]=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                bord[i][j]='X';   
             }
        }
        if(nqueen(bord,0))
        {
            System.out.println("Solution possible");
            print(bord);
        }else{
            System.out.println("Solution Not possible");
        }
        //System.out.println("the number of possible solutions "+count);

    
}

    
}
