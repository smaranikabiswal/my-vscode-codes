public class findsubset{
    public static void find(String str,String ans,int i){
        if (i==str.length()) {
           System.out.println(ans); 
           return;
        }
        find(str, ans+str.charAt(i), i+1);
        find(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        find(str, "", 0);
    }
}