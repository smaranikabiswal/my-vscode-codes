import java.util.*;

public class selection{
    public static void sorting(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
           int min=i;
           for (int j = i+1; j < arr.length; j++) {
              if (arr[min]>arr[j]) {
              min=j;

              }
               
           }
           int temp=arr[min];
           arr[min]=arr[i];
           arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
            
        }
        sorting(arr);
        printarr(arr);
    }
}