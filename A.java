class Test{
    protected void m1(){
        System.out.println("hii");
    }
}
public class A{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.m1();
    }
}