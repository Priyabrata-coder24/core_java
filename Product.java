public class Product {
    int PID;
    String PName;

    Product(int PID , String PName){
        this.PID = PID;
        this.PName = PName;
    }
    Product(Product p){ // copy constuctor 
        this.PID = p.PID; // here we call p.PID as (p) is a reference variable
        this.PName = p.PName;
    }
    public static void main(String[] args) {
        Product p1 = new Product(10 , "kanha");
        System.out.println(p1.PID+" "+p1.PName);
        Product p2 = new Product(p1);
        System.out.println(p2.PID+" "+p2.PName);
    }
}
