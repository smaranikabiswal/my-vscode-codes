import java.util.*;
public class quick{
    public static void sorting(int arr[],int low,int high){
        if(low>=high)return;
        int start=low;
        int end=high;
        int pivot=arr[low];
        while(start<end){
            while (start<end && arr[end]>=pivot) { 
                end--;
            }
            while(start<end && arr[start]<=pivot){
                start++;
            }
            if (start<end) {
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp; 
            }
        }
        int temp=arr[low];
        arr[low]=arr[start];
        arr[start]=temp;
        sorting(arr,low,start-1);
        sorting(arr,start+1,high);
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
        sorting(arr,0,size-1);
        System.out.println("sorted array is");
        printarr(arr);
    }
}
   
    
