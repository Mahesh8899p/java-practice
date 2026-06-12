public class Valuev{

    public static void change(int i, double price , boolean flag , char letter){
        i = 99;
        price = 6.70;
        flag = false;
        letter = 'B';

    }
    public static void main(String[]args){
        int i = 10;
        double price = 5.50;
        boolean flag = true;
        char letter = 'A';

        System.out.println("before method call" + "i " + i + "price" + price + "flag" + flag + "letter" + letter);

        change(i,price,flag,letter);

        System.out.println("after method call" + "i " + i + "price" + price + "flag" + flag + "letter" + letter);


    }    
}

