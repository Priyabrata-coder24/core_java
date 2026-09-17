class A{
    public A(){
        System.out.println("hello");
    }
    public A(int x){
        System.out.println("world");
    }
}
class B extends A{
    public B() {
        super(200);
        System.out.println("welcome");
    }
public  B(int name){
    System.out.println("back");
}
}
public class con{
    public static void main(String[] args) {
      new B(10);

    }
}
// it is a con-chaining of using super keyword .........
