





public class spiralmatrix{
    public static void spiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while (startrow<=endrow && startcol<=endcol) { 
            
        
        for (int j =startcol; j <=endcol-1; j++) {
System.out.print(matrix[startrow][j]+" ");
            
        }
       for (int i =startrow; i <=endrow-1; i++) {
System.out.print(matrix[i][endcol]+" ");
            
        }
        for (int j =endcol-1; j >=startcol; j--) {
System.out.print(matrix[endrow][j]+" ");
            
        }
        for (int i =endrow-1; i >=startrow+1;i--) {
System.out.print(matrix[i][startcol]+" ");
            
        } 
        startcol++;
startrow++;
endcol--;
endrow--;
    }
   System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};

       spiral(matrix); 
    }}
