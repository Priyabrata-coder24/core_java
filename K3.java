class R{
    R(){
        this(null);
        System.out.println("Radha");
    }
    R(String s){
        System.out.println("Ladlii juu ..");
    }
}
class K extends R{
    K(){
        super(null);
        System.out.println("vrindaban");
    }
    K(int x){
        super();
        System.out.println("krishna mono harini");
    }
}
public class K3 {
    public static void main(String[] args) {
        K k1 = new K(); // Ladlii juu , Radha , krishna mono harini
        R r1 = new R(); // Ladlii juu , Radha
    }
}
