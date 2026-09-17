abstract class L{
    abstract int m5();
}
class Z extends L{
    protected  int m5(){
        System.out.println("it is a primitive type example");
        return 10;
    }
}
public class Radha{
    public static void main(String[] args) {
    L l1 = new Z();
    int x = l1.m5();
    System.out.println(x);
}
}
