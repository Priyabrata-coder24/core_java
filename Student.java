
public class Student  {
    int roll;
    String name;
    Student(int roll , String name){
        this.roll = roll;
        this.name = name;
    }
    public static void main(String[] args) {
        Student s1 = new Student(24 , "kanha");
        System.out.println(s1.roll+ " "+s1.name); // 24 , kanha
        Student s2 = new Student(22 , "bapun");
        System.out.println(s2.roll+" "+s2.name);
    }
}
