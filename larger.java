import java.util.Scanner;

public class larger {
    public static void large(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]>max){
                    max=matrix[i][j];
                }
            
            }
            
          }
          System.out.println(max);


    }
    public static void traverse (int matrix[][]){
        int startrow =0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");

            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");

            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

    }
    
    public static void print_m(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                
                System.out.print(" " +matrix[i][j]);
            
            }
            System.out.println();
          }
    }
     public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
      int matrix [][]=new int[2][3];
      for (int i=0;i<matrix.length;i++){
        for (int j=0;j<matrix[0].length;j++){
            matrix[i][j]=sc.nextInt();
        
        }
      }
      
    // large(matrix);
     //traverse(matrix);
     print_m(matrix);
    
     int transpose[][]=new int [3][2];
     for (int i=0;i<matrix.length;i++){
        for (int j=0;j<matrix[0].length;j++){
           transpose[j][i]=matrix[i][j];
        
        }
      }
      print_m(transpose);
    }
    
}
