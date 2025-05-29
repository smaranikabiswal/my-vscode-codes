public class bk{
    public static void change(int arr[],int i,int val){
        if (i==arr.length) {
            printarr(arr);
            return;
        }
arr[i]=val;
change(arr, i+1, val+1);
arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[]){
        for (int i = 0; i <arr.length-1; i++) {
         System.out.print(arr[i]+" ");   
        }
        System.out.println();
    }
public static void main(String[] args) {
    int arr[]=new int[5];
change(arr, 0, 1);
printarr(arr);
}
}