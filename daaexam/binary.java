import java.util.*;
public class binary{
    public static int search(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==key) {
             return mid;   
            }if(arr[mid]<key){
              start=mid+1;  
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
     
    public static void main(String args[]){
        int key=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
            
        }
       
        
        System.out.println("index is "+search(arr,key));
    }
}
