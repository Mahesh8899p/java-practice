class Box{
    int value;
}
class Valuevv{

    public static void change(Box mybox){
        mybox.value = 100;
    }
    //value actually changes in object  
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.value = 10;
        System.out.println(b1.value);
        change(b1);
        System.out.println(b1.value);

    }
}