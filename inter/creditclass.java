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
        System.out.println("refunded" + amount + " " + currency + "to credit card"); 
    }
    public boolean validatePayment(){
        System.out.println("Credit card validated");
        return true;
        
    }
}
