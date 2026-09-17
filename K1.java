class A{
    A(int x){
        System.out.println("abc");
    }
}
class B extends A{
    B(){
        System.out.println("def");
    }
}
public class K1 {
    public static void main(String[] args) {
        B b1 = new B();
    }
}
// in this program we will get compile time error
