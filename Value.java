//pass by value java example
public class Value{

    public static void change(int x, int y){
        System.out.println("x before change " + x + " before change " + y);
        x = 999;
        y = 1000;
        System.out.println("x after change " + x + " after change " + y);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("before method call" + a + b);
        change(a,b);
        System.out.println("after method call" + a + b);
    }
}