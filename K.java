class A{
    A(){
        System.out.println("one");
    }
}
class B extends A{
    B(){
        System.out.println("two");
    }
}
public class K {
    public static void main(String[] args) {
        B b1 = new B();
    }
}
// if we are not providing any method like call to  super then the super method always be there .....
