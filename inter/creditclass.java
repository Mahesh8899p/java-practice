package inter;

public class creditclass implements payment {
    String cardnumber;

    creditclass(String cardnumber){
        this.cardnumber = cardnumber;
    }
    
    public void pay(double amount){
        System.out.println("paid" + amount + " " + currency + "via credit card");
    }
    public void refund(double amount){
        System.out.println
    }
    public boolean validatePayment(double amount){
        
    }
}
