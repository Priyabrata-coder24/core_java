public class con1 {
    con1(int x){
        this(10); //recursive constructor invocation
        System.out.println("abs");
    }
    con1(float f){
        System.out.println("def");
    }
    public static void main(String[] args) {
        con1 c1 = new con1(10);
    }
}
