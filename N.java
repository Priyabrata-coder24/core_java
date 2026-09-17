class Box {
    int width, height;

    Box() {
        this(10, 10); // Calls the parameterized constructor below
    }

    Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

public class N {
    public static void main(String[] args) {
        Box box1 = new Box();
    }
}
