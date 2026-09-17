abstract class Kanha{
    abstract void m4();
}
class Radha extends Kanha{
    public void m4(){
        System.out.println("it is a example of abstract method");
    }
}
public class Demo {
    public static void main(String[] args) {
        Kanha k1 = new Radha();
        k1.m4();
    }
}
