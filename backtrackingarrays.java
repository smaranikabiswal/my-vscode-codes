public class backtrackingarrays{
public static void change(int arr[],int i){
    if (i==arr.length) {
      printarr(arr);
      return;  
    }
   
    change(arr, i+1);
    arr[i]=arr[i]-2;
}
public static void printarr(int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
      System.out.print(arr[i]+" ");  
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    change(arr, 0);
    printarr(arr);
}
}
