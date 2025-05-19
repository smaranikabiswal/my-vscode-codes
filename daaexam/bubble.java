import java.util.*;
public class bubble{
    public static void sorting(int arr[]){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length-1; j++) {
             if (arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp; 
             }   
            }
            
        }
    }
    public static void printarr(int arr[]){
        for (int k = 0; k < arr.length; k++) {
         System.out.print(arr[k]+" ");   
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter size of the array");
       int size=sc.nextInt();
int arr[]=new int[size];
      for (int i = 0; i <size; i++) {
        arr[i]=sc.nextInt();  
        
      } 
      
        sorting(arr);
        printarr(arr);
    }}
