class N{
    N(){
        System.out.println("abc");
    }
    N(int x){
        System.out.println("def");
    }
}
class X extends N{
    X(){
        System.out.println("ghi");
    }
    X(String s){
        super(100);
        System.out.println("jkl");
    }
}
public class K4 {
    public static void main(String[] args) {
        X c1 = new X(null); // 
    }
}
