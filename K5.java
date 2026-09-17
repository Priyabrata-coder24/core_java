class W {
    W(){
        System.out.println("it is a default");
    }
}
class H extends W{

}
public class K5 {
    public static void main(String[] args) {
        H h1 = new H();
    }
}
