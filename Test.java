interface A{
    default void m1(){
        System.out.println("abc");
    }
}
interface B{
    default void m2(){
        System.out.println("def");
    }
}
interface C extends A,B{
    default void m3(){
        System.out.println("gif");
    }
}
public class Test implements C{
    public void m1(){
        System.out.println("it is parent class of c and b");
    }
    public void m2(){
        System.out.println("it is parent class of C");
    }
    public void m3(){
        System.out.println("it is sub class of A and B");
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.m1();
        t1.m2();
        t1.m3();
    }
}