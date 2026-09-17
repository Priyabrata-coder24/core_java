public class O{
    public static void main(int a){
        System.out.println("one");
    }
    public static void main(String s) {
        System.out.println("two");
    }
    public static void main(String[] args) {
        O v1 = new O();
        v1.main(10);
        v1.main("kanha");
    }
}