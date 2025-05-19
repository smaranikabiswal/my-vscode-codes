import java.util.*;
public class insertion{
    public static void insert(int arr[]){
        for (int i = 1; i < arr.length; i++) {
         int curr=arr[i];
         int prev=i-1;
         while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
         }  
         arr[prev+1]=curr; 
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
        insert(arr);
        printarr(arr);
    }
}
