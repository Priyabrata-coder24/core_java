public class con2 {
    con2(){
        this(10);
        System.out.println("abc");
    }
    con2(float f){
        System.out.println("def");
    }
    con2(int x){
        this(10.5f);
        System.out.println("gif");
    }
    public static void main(String[] args) {
        con2 c1 = new con2();
    }
}
// it is a example of con-chaining of using this keyword
