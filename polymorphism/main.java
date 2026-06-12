package polymorphism;

public class main {
    public static void main(String[] args) {
        shapes sh = new shapes();
        rectangle re = new rectangle();
        square sq = new square();
        triangle tr = new triangle();

        sh.area();
        re.area();
        sq.area();
        tr.area();

    }
}
