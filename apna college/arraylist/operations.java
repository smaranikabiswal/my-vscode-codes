
import java.util.ArrayList;

public class operations{
public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    //add element operation
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    list.add(1,9);
    System.out.println(list);
    //get element operation
   int element= list.get(2);
    System.out.println(element);
    //remove element operation
    list.remove(1);
    System.out.println(list);
    //set element at index operation
list.set(2,0);
System.out.println(list);
//contains element operation
System.out.println(list.contains(1));
System.out.println(list.contains(11));
}
}