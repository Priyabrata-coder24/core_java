/*interface A {
    int x = 10; // this a static because we can't create object of interface
}
 this is public because it can access from anywhere
 this is final because no-one can reinisialize it 
interface A{
    int x = 10;
}
public class Trust implements A{
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(Trust.x);
        System.out.println(A.x);
        Trust t1 = new Trust();
        System.out.println(t1.x);
    }
}
// here it will prove that the variable which is present in interface A is bydefault static .

interface A{
    int x = 10;
}
public class Trust implements A{
    int x = 20;
    public static void main(String[] args) {
        int x = 30;
        System.out.println(x);//30
        //System.out.println(Trust.x); // this is compile-time error
        System.out.println(A.x); //10
        System.out.println(new Trust().x); // 20
}
}
/// here it will prove that the variable which is present in interface A is bydefault static
/// */
interface A{
    int x = 10;
}
public class Trust implements A{
  
    public static void main(String[] args) {
       Trust.x = 20; // here we will get error because bydefaultly the variable is final
}
}
