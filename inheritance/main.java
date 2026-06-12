package inheritance;

public class main{
    public static void main(String[] args) {
        box b1 = new box();
        System.out.println("box l is " + b1.l + "box h is " + b1.h + "box w is " + b1.w);
        boxweight bu = new boxweight();
        System.out.println("boxweight l is" + bu.l + "boxweight h is" + bu.w + "boxweight w is" + bu.h + "bodyweight weight is " + bu.weight);
    }

}
