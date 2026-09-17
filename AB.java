abstract class A{
    abstract void m1();
}
class B extends A{
    public void m1(){
        System.out.println("abc");
    }
}
public class AB extends B{
    public static void main(String[] args) {
        B b1 = new AB();
        b1.m1();
    }
}
