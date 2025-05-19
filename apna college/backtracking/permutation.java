

public class permutation{
    public static void per(String str,String ans){
        if (0==str.length()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

          String nstr=str.substring (0,i)+str.substring(i+1);
           per(nstr, ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="abc";
        per(str, "");
    }
}