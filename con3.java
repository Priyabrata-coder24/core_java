public class con3 {
    con3(){
        this("abc");
        System.out.println("one");
    }
    con3(String s){
        System.out.println("two");
    }
}
class B extends con3{
    B(int x){
        super();
        System.out.println();
    }
}
class Test{
    public static void main(String[] args) {
        B b1 = new B(10);
        A a1 = new A();
    }
}
