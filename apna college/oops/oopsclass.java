public class oopsclass{
    public static void main(String[] args) {
     pen p1=new pen();  
     p1.setcolor("blue"); 
     System.out.println(p1.color);
     p1.settip(5);
     System.out.println(p1.tip);
    }
}
class pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;

    }
    void settip(int newtip){
tip=newtip;
    }
}